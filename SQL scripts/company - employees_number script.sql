USE [Autocomplete]
GO
/****** Object:  Table [dbo].[number_of_employees_579]    Script Date: 09.07.2022 22:32:20 ******/
DROP TABLE [dbo].[number_of_employees_579]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[number_of_employees_579](
	[KODJAZ] [nvarchar](10) NOT NULL,
	[AKRCIS] [nvarchar](50) NOT NULL,
	[KODCIS] [nvarchar](10) NOT NULL,
	[CHODNOTA] [nvarchar](10) NOT NULL,
	[ZKRTEXT] [nvarchar](50) NOT NULL,
	[TEXT] [nvarchar](50) NOT NULL,
	[ADMPLOD] [date] NOT NULL,
	[ADMNEPO] [date] NOT NULL
) ON [PRIMARY]
GO
BULK INSERT [Autocomplete].[dbo].[number_of_employees_579]
FROM 'F:\autocomplete_csv\dictionaries\number_of_empl_fix.csv'
WITH (
DATAFILETYPE = 'char',
CODEPAGE = '1250',
FIRSTROW=2,
FIELDTERMINATOR=';',
ROWTERMINATOR = '0x0a'
)
GO