USE [Autocomplete]
GO
/****** Object:  Table [dbo].[res_data]    Script Date: 11.07.2022 23:52:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[res_data](
	[ICO] [nvarchar](10) NULL,
	[OKRESLAU] [nvarchar](10) NULL,
	[DDATVZN] [date] NULL,
	[DDATZAN] [date] NULL,
	[ZPZAN] [nvarchar](5) NULL,
	[DDATPAKT] [date] NULL,
	[FORMA] [nvarchar](3) NULL,
	[ROSFORMA] [nvarchar](3) NULL,
	[KATPO] [nvarchar](3) NULL,
	[NACE] [nvarchar](5) NULL,
	[ICZUJ] [nvarchar](6) NULL,
	[FIRMA] [nvarchar](300) NULL,
	[CISS2010] [nvarchar](10) NULL,
	[KODADM] [nvarchar](10) NULL,
	[TEXTADR] [nvarchar](250) NULL,
	[PSC] [nvarchar](5) NULL,
	[OBEC_TEXT] [nvarchar](50) NULL,
	[COBCE_TEXT] [nvarchar](50) NULL,
	[ULICE_TEXT] [nvarchar](50) NULL,
	[TYPCDOM] [nvarchar](1) NULL,
	[CDOM] [nvarchar](5) NULL,
	[COR] [nvarchar](5) NULL,
	[DATPLAT] [date] NULL,
	[PRIZNAK] [nvarchar](2) NULL
) ON [PRIMARY]
GO
