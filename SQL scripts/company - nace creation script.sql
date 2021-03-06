USE [Autocomplete]
GO
/****** Object:  Table [dbo].[dict_nace]    Script Date: 05.07.2022 22:36:34 ******/
DROP TABLE [dbo].[dict_nace]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dict_nace](
	[KODJAZ] [nvarchar](50) NULL,
	[AKRCIS] [nvarchar](50) NULL,
	[KODCIS] [nvarchar](10) NULL,
	[UROVEN] [nvarchar](4) NULL,
	[CHODNOTA] [nvarchar](10) NULL,
	[ZKRTEXT] [nvarchar](150) NULL,
	[TEXT] [nvarchar](150) NULL,
	[ADMPLOD] [nvarchar](150) NULL,
	[ADMNEPO] [nvarchar](150) NULL,
	[NADVAZ] [nvarchar](20) NULL
) ON [PRIMARY]
GO
