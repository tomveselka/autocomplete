# Autocomplete

This is small Java project to try creating an autocomplete feature for addresses in Czechia, using publicly available data from Katastr, published regularly in csv and imported into database (in my case, Microsoft SQL Server). 


## Address

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

![Mapping](/ReadMe%20images/autocomplete%20mapping.png) 


## Importing data
Scripts for creation of tables are in aptly named folder "SQL scripts". In addition, there are scripts for importing multiple csv at once, since ADM are in separate csv for each Obec. Last script is for general import with proper encoding which handles Czech special characters.

## Example
Please be aware that primary goal was *Autocomplete*, resp. searching for addresses, *not* the front-end. As such, design of form is rather minimalistic, as it is only there to actually see the Autocomplete in action. In addition, there are more fields than would realisticaly be shown to user, however they are needed for logic and to check results, they are visible here.

This is how form looks before searching

![Form](/ReadMe%20images/autocomplete%20form.png) 


After three letters are typed, Autocomplete starts offering options. In case when there are multiple places of same name, Okres is added in brackets (this is merely display name, there is additional field containing actual name without Okres)

![City options](/ReadMe%20images/autocomplete%20city%20list.png)    ![City selected](/ReadMe%20images/autocomplete%20city%20selected.png)

Same works for Street.

Last part is house number, which is specific in that it searches in THREE potential columns - House number (Red table on house), Street number (Blue table on house) and by letter which on some occasions is added (ex. "Pernerova 559/44a")

![City selected](/ReadMe%20images/autocomplete%20house%20number%20list.png)


And we are done, below is final result as well as check on CUZK that ADM number is correct

![Result](/ReadMe%20images/autocomplete%20fin.png)

![Result](/ReadMe%20images/autocomplete%20cuzk%20check.png)



## Company

## Data sources

Files are available on website of Czech Statistics Office

- Main file is list of all Companies and FO with bussiness in Czechia, over 3,2 million of them, which are updated twice a month (1. and 15. day) and is available [here](https://www.czso.cz/csu/czso/registr-ekonomickych-subjektu-otevrena-data).
- Documentation for the file, as well as multiple dictionaries can all be found [here](https://www.czso.cz/csu/czso/registr-ekonomickych-subjektu-otevrena-data-dokumentace).

## Example

This is much simpler autocomplete than address, since there is no "multi-stage" selection. User simply starts typing either name, or ICO of company and relevant list of offers appears. When it is selected, all data are filed in.
