USE [Autocomplete]
GO
/****** Object:  Table [dbo].[street]    Script Date: 16.06.2022 21:32:39 ******/
DROP TABLE [dbo].[street]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[street](
	[KOD] [nvarchar](20) NULL,
	[NAZEV] [nvarchar](50) NULL,
	[OBEC_KOD] [nvarchar](10) NULL,
	[PLATI_OD] [nvarchar](20) NULL,
	[PLATI_DO] [nvarchar](20) NULL
) ON [PRIMARY]
GO
