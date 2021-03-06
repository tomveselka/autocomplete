USE [Autocomplete]
GO
/****** Object:  Table [dbo].[addresses]    Script Date: 13.06.2022 16:30:57 ******/
DROP TABLE [dbo].[addresses]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[addresses](
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
GO
