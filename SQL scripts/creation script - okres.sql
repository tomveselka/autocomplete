USE [Autocomplete]
GO
/****** Object:  Table [dbo].[okres]    Script Date: 16.06.2022 19:33:59 ******/
DROP TABLE [dbo].[okres]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[okres](
	[Kód] [nvarchar](6) NOT NULL,
	[Název_Okresu] [nvarchar](50) NOT NULL,
	[Kód_Kraje_VÚSC] [nvarchar](3) NOT NULL,
	[Název_Kraje_VÚSC] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
