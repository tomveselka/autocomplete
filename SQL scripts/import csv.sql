BULK INSERT [Autocomplete].[dbo].[obec]
FROM 'F:\autocomplete_csv\dictionaries\UI_ULICE.csv'
WITH (
DATAFILETYPE = 'char',
CODEPAGE = '1250',
FIRSTROW=2,
FIELDTERMINATOR=';',
ROWTERMINATOR = '0x0a'
)
GO

