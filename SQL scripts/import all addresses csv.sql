IF OBJECT_ID('TEMPDB..#TEMP_FILES') IS NOT NULL DROP TABLE #TEMP_FILES

CREATE TABLE #TEMP_FILES
(
FileName VARCHAR(MAX),
DEPTH VARCHAR(MAX),
[FILE] VARCHAR(MAX)
)
 
INSERT INTO #TEMP_FILES
EXEC master.dbo.xp_DirTree 'F:\autocomplete_csv\ruian\CSV\',1,1
 
DECLARE @FILENAME VARCHAR(MAX),@SQL VARCHAR(MAX)
 
IF OBJECT_ID('TEMPDB..#TEMP_RESULTS') IS NOT NULL DROP TABLE #TEMP_RESULTS

DROP TABLE [Autocomplete].[dbo].[adresni_mista]

CREATE TABLE [Autocomplete].[dbo].[adresni_mista]
(
	[Kod_ADM] [nvarchar](9) NOT NULL,
	[Kod_obce] [nvarchar](9) NULL,
	[Nazev_obce] [nvarchar](60) NULL,
	[Kod_MOMC] [nvarchar](9) NULL,
	[Nazev_MOMC] [nvarchar](50) NULL,
	[Kod_obvodu_Prahy] [nvarchar](9) NULL,
	[Nazev_obvodu_Prahy] [nvarchar](60) NULL,
	[Kod_casti_obce] [nvarchar](9) NULL,
	[Nazev_casti_obce] [nvarchar](60) NULL,
	[Kod_ulice] [nvarchar](9) NULL,
	[Nazev_ulice] [nvarchar](60) NULL,
	[Typ_SO] [nvarchar](60) NULL,
	[Cislo_domovni] [nvarchar](8) NULL,
	[Cislo_orientacni] [nvarchar](8) NULL,
	[Znak_cisla_orientacniho] [nvarchar](5) NULL,
	[PSC] [nvarchar](5) NULL,
	[Souradnice_Y] [nvarchar](15) NULL,
	[Souradnice_X] [nvarchar](15) NULL,
	[Plati_Od] [datetime2](7) NULL
) ON [PRIMARY]
 
WHILE EXISTS(SELECT * FROM #TEMP_FILES)
BEGIN
   BEGIN TRY
      SET @FILENAME = (SELECT TOP 1 FileName FROM #TEMP_FILES)
      SET @SQL = 'BULK INSERT  [Autocomplete].[dbo].[adresni_mista]
      FROM ''F:\autocomplete_csv\ruian\CSV\' + @FILENAME +'''
		WITH (
		DATAFILETYPE = ''char'',
		CODEPAGE = ''1250'',
		FIRSTROW=2,
		FIELDTERMINATOR='';'',
		ROWTERMINATOR = ''0x0a''
		);'

      PRINT @SQL
      EXEC(@SQL)
   END TRY
   BEGIN CATCH
      PRINT 'Failed processing : ' + @FILENAME
   END CATCH

   DELETE FROM #TEMP_FILES WHERE FileName = @FILENAME
END 