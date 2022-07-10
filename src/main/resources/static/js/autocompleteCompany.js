//https://stackoverflow.com/questions/51667936/jquery-autocomplete-fill-multiple-fields-by-selecting-suggested-option
$(document).ready(function () {
    $("#name").autocomplete({
        source:function(request, response) {    
        	var companyName = $('#name').val();
			var url = "/company_autocomplete/name?companyName="+encodeURIComponent(companyName);
            $.ajax({
                url: url,
                type: "GET",
                dataType: "json",
                data: {
                },
               
                success: function(data) {
                	response($.map(data, function (value, key) {
                        return {
                            label: value.name,
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
          	  $('#name').val(ui.item.value.name);
          	  $("#ico").val(ui.item.value.ico);
      		  $('#dateOfCreation').val(ui.item.value.dateOfCreation);  
      		  $('#companyForm').val(ui.item.value.companyForm);
      		  $("#numberOfEmpl").val(ui.item.value.numberOfEmpl);
          	  $("#sector").val(ui.item.value.sector);
      		  $('#city').val(ui.item.value.city);  
      		  $('#street').val(ui.item.value.street);
          	  $("#houseNumber").val(ui.item.value.houseNumber);
      		  $('#zipCode').val(ui.item.value.zipCode);          
          },
    	minLength : 3    
    });
    
    $("#ico").autocomplete({
        source:function(request, response) {    
        	var companyIco = $('#ico').val();
			var url = "/company_autocomplete/ico?companyIco="+encodeURIComponent(companyIco);
            $.ajax({
                url: url,
                type: "GET",
                dataType: "json",
                data: {
                },
               
                success: function(data) {
                	response($.map(data, function (value, key) {
                        return {
                            label: value.ico,
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
          	  $('#name').val(ui.item.value.name);
          	  $("#ico").val(ui.item.value.ico);
      		  $('#dateOfCreation').val(ui.item.value.dateOfCreation);    
      		  $('#companyForm').val(ui.item.value.companyForm);
      		  $("#numberOfEmpl").val(ui.item.value.numberOfEmpl);
          	  $("#sector").val(ui.item.value.sector);
      		  $('#city').val(ui.item.value.city);  
      		  $('#street').val(ui.item.value.street);
          	  $("#houseNumber").val(ui.item.value.houseNumber);
      		  $('#zipCode').val(ui.item.value.zipCode); 
          },
    	minLength : 3      
    });
    
});