# Autocomplete

This is small Java project to try creating an autocomplete feature for addresses in Czechia, using publicly available data from Katastr, published regularly in csv and imported into database (in my case, Microsoft SQL Server). 

## Data sources
Files are distributed amongst multiple pages on cuzk.cz.

Main ones are:
- Main file is list of all Addresses (*Adresní místa* or *ADM*) in Czechia, over 2,9 million of them, which are updated on monthly basis are available [here](https://nahlizenidokn.cuzk.cz/StahniAdresniMistaRUIAN.aspx).
- Since Autocomplete first searches by Town (*Obec*), it would be wasteful to search in table of all ADMs and instead, table of just Obce is used, available [here](https://www.cuzk.cz/ruian/Poskytovani-udaju-ISUI-RUIAN-VDP/Ciselniky-ISUI/Nizsi-uzemni-prvky-a-uzemne-evidencni-jednotky/Obce.aspx).
- After selecting Obec, it is time to search by Street, with results of course already filtered by previously selected Obec. Once again, there is special file with all streets in Czechia, available [here](https://www.cuzk.cz/ruian/Poskytovani-udaju-ISUI-RUIAN-VDP/Ciselniky-ISUI/Nizsi-uzemni-prvky-a-uzemne-evidencni-jednotky.aspx).

In addition, there are additional tables needed:
- [Kraje](https://vdp.cuzk.cz/vdp/ruian/vusc/vyhledej) (*Vyšší územně správní celek* or *VUSK* is same thing as *Kraj*, just with fancier name)
- [Okresy](https://vdp.cuzk.cz/vdp/ruian/okresy/vyhledej)

In those cases, I didnt find immediate "Download" button, instead I clicked "Vyhledat" without any parameters, which returned list of all Kraj/Okres and then choose "Export CSV"

- Last needed file is mapping between ADM and Okresy and Kraje, which can be found [here](https://nahlizenidokn.cuzk.cz/StahniAdresniMistaRUIAN.aspx) just like ADM list  under "Hierarchie prvků RÚIAN", which upon unpacking contains multiple csv, we need one called "adresni-mista-vazby-cr"
