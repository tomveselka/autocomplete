USE [Autocomplete]
GO
/****** Object:  Table [dbo].[dict_149_form_ros]    Script Date: 05.07.2022 22:53:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dict_149_form_ros](
	[KODJAZ] [nvarchar](50) NOT NULL,
	[AKRCIS] [nvarchar](50) NOT NULL,
	[KODCIS] [nvarchar](20) NOT NULL,
	[CHODNOTA] [nvarchar](10) NOT NULL,
	[ZKRTEXT] [nvarchar](150) NOT NULL,
	[TEXT] [nvarchar](150) NOT NULL,
	[ADMPLOD] [date] NOT NULL,
	[ADMNEPO] [date] NOT NULL
) ON [PRIMARY]
GO
