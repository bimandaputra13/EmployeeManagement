jQuery(document).ready(function() {
	console.log("masuk datatable")
	var table = $("#tblEmployee").DataTable({
		ajax : {
			contentType : 'application/json',
			url :'/employee/getDataTable',
			type : 'POST',
			data : function(d) {
				return JSON.stringify(d);
			}
		},
		serverSide : true,
		columns : [{
			title : "NIP",
			data : "nip"
		}, {
			title : "Nama",
			data : "nama"
		}, {
			title : "Tanggal Lahir",
			data : "tglLahir"
		}, {
			title : "Email",
			data : "email"
		}, {
			title : "Jabatan",
			data : "jabatan"
		}, {
			title : "Sallary",
			data : "gaji"
		},
		/*{
			title : "Tindakan",
			searchable : false,
			sortable : false,
			"defaultContent" : getButtonGroup(true, true, false)
		}*/ ],


		bFilter : true,
		bLengthChange : true,
		responsive : true,
		dom: 'ltip',
		order : [ [ 1, 'desc' ] ]
	});

	
	

});