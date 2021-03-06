USE [Autocomplete]
GO
/****** Object:  Table [dbo].[obec]    Script Date: 16.06.2022 19:36:45 ******/
DROP TABLE [dbo].[obec]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[obec](
	[KOD] [nvarchar](10) NOT NULL,
	[NAZEV] [nvarchar](50) NOT NULL,
	[STATUS_KOD] [nvarchar](3) NULL,
	[POU_KOD] [nvarchar](10) NULL,
	[OKRES_KOD] [nvarchar](10) NULL,
	[CLENENI_SM_ROZSAH_KOD] [nvarchar](5) NULL,
	[CLENENI_SM_TYP_KOD] [nvarchar](5) NULL,
	[PLATI_OD] [nvarchar](20) NULL,
	[PLATI_DO] [nvarchar](20) NULL,
	[DATUM_VZNIKU] [nvarchar](20) NULL
) ON [PRIMARY]
GO
