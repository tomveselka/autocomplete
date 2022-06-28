//https://stackoverflow.com/questions/51667936/jquery-autocomplete-fill-multiple-fields-by-selecting-suggested-option
$(document).ready(function () {
    $("#obecNameDisplay").autocomplete({
        source:function(request, response) {    
        	var obecInput = $('#obecNameDisplay').val();
			var url = "/address_autocomplete/obec?obecInput="+encodeURIComponent(obecInput);
            $.ajax({
                url: url,
                type: "GET",
                dataType: "json",
                data: {
                },
               
                success: function(data) {
                	response($.map(data, function (value, key) {
                        return {
                            label: value.nazevDisplay,
                            value: value
                        };
                    }))
                }             
            })       
        },    
        change: function (event, ui) {
            //Forces input to source values, otherwise, clears
            //NOTE : user could still submit right after typing => check server side
            if (!ui.item) {
              //http://api.jqueryui.com/autocomplete/#event-change -
              // The item selected from the menu, if any. Otherwise the property is null
              //so clear the item for force selection
              $(event.target).val("");
              $(event.target).addClass("is-invalid");
            }
            else {
              $(event.target).removeClass("is-invalid");
            }
          },
        select: function(event, ui) { 
        	  event.preventDefault()
          	 $('#obecKod').val(ui.item.value.kod);
          	 $("#obecNameDisplay").val(ui.item.value.nazevDisplay);
      		 $('#obecName').val(ui.item.value.nazev);          
      		 
      		 $('#streetName').val('');
         	 $("#streetKod").val('');  
      		 $('#houseNumber').val('');
         	 $("#zipCode").val('');       
         	 $("#kodADM").val('');  
          },
    	minLength : 3    
    });
    
    $("#streetName").autocomplete({
        source:function(request, response) {    
        	var obecKod = $('#obecKod').val();
        	var streetInput = $('#streetName').val();
			var url = "/address_autocomplete/street?obecKod="+encodeURIComponent(obecKod)+"&streetInput="+encodeURIComponent(streetInput);
            $.ajax({
                url: url,
                type: "GET",
                dataType: "json",
                data: {
                },
               
                success: function(data) {
                	response($.map(data, function (value, key) {
                        return {
                            label: value.nazev,
                            value: value
                        };
                    }))
                }             
            })       
        },    
        change: function (event, ui) {
            //Forces input to source values, otherwise, clears
            //NOTE : user could still submit right after typing => check server side
            if (!ui.item) {
              //http://api.jqueryui.com/autocomplete/#event-change -
              // The item selected from the menu, if any. Otherwise the property is null
              //so clear the item for force selection
              $(event.target).val("");
              $(event.target).addClass("is-invalid");
            }
            else {
              $(event.target).removeClass("is-invalid");
            }
          },
        select: function(event, ui) { 
        	  event.preventDefault()
          	 $('#streetName').val(ui.item.value.nazev);
          	 $("#streetKod").val(ui.item.value.kod);     
          	 $('#houseNumber').val('');
         	 $("#zipCode").val('');       
         	 $("#kodADM").val('');  
          },
    	minLength : 3      
    });
    
    $("#houseNumber").autocomplete({
        source:function(request, response) {    
        	var obecKod = $('#obecKod').val();
        	var streetKod = $('#streetKod').val();
        	var numberInput = $('#houseNumber').val();
			var url = "/address_autocomplete/house?obecKod="+encodeURIComponent(obecKod)+"&streetKod="+encodeURIComponent(streetKod)+"&numberInput="+encodeURIComponent(numberInput);
            $.ajax({
                url: url,
                type: "GET",
                dataType: "json",
                data: {
                },
               
                success: function(data) {
                	response($.map(data, function (value, key) {
                        return {
                            label: value.cisloDisplay,
                            value: value
                        };
                    }))
                }             
            })       
        },    
        change: function (event, ui) {
            //Forces input to source values, otherwise, clears
            //NOTE : user could still submit right after typing => check server side
            if (!ui.item) {
              //http://api.jqueryui.com/autocomplete/#event-change -
              // The item selected from the menu, if any. Otherwise the property is null
              //so clear the item for force selection
              $(event.target).val("");
              $(event.target).addClass("is-invalid");
            }
            else {
              $(event.target).removeClass("is-invalid");
            }
          },
        select: function(event, ui) { 
        	  event.preventDefault()
          	 $('#houseNumber').val(ui.item.value.cisloDisplay);
          	 $("#zipCode").val(ui.item.value.zipCode);       
          	 $("#kodADM").val(ui.item.value.kodADM);  
          },
    	minLength : 1      
    });
});