function getValidationFeedback(text) {
    return '<div class="form-control-feedback m--font-danger">' + text + '</div>';
}

function getButtonGroup(del, edit, detail, dokumen, additional = false, additionalText = "", additionalIcon = "", additional2 = false, additional2Text = "", additional2Icon = "") {
    var element = "";

    if (del === true)
    {
        element += "<a href='javascript:void(0);' class='btn btn-sm btn-clean btn-icon btn-icon-md delete-button' title='Delete'><i class='la la-trash'></i></a>";
    }

    if(edit === true)
    {
        element += "<a href='javascript:void(0);' class='btn btn-sm btn-clean btn-icon btn-icon-md edit-button' title='Edit'><i class='la la-edit'></i></a>";
    }

    if (detail === true)
    {
        element += "<a href='javascript:void(0);' class='btn btn-sm btn-clean btn-icon btn-icon-md detail-button' title='Detail'><i class='la la-search'></i></a>";
    }
    
    if (dokumen === true)
    {
    	element += "<a href='javascript:void(0);' class='btn btn-sm btn-clean btn-icon btn-icon-md dokumen-button' title='Dokumen'><i class=' la la-file-text '></i></a>";
    }

    if (additional === true)
    {
    	element += "<a href='javascript:void(0);' class='btn btn-sm btn-clean btn-icon btn-icon-md additional1-button' title='Pengembalian'><i class=' la la-check '></i></a>";
    }
    
    /*if (dokumen === true)
    {
    	element += "<a href='javascript:void(0);' class='btn btn-sm btn-clean btn-icon btn-icon-md additional1-button' title='Dokumen'><i class=' la la-file-text '></i></a>";
    }*/

    if (additional2 === true) {
    	element += "<a href='javascript:void(0);' class='btn btn-sm btn-clean btn-icon btn-icon-md additional2-button' title='coba'><i class='la la-file-text'></i></a>";
    }

    element += "</div></div>";

    return element;
}

function getTrueFalseElement(value) {
    var element = "";
    if (value === true) {
        element = '<i class="fa fa-check-square kt-font-success"></i>';
    } else {
        element = '<i class="fa fa-window-close kt-font-danger"></i>';
    }

    return element;
}

function getActiveInactive(value) {
	var element = "";
    if (value === true) {
        element = '<span class="kt-badge kt-badge--success kt-badge--inline kt-badge--pill">Active</span>';
    } else {
        element = '	<span class="kt-badge kt-badge--error kt-badge--inline kt-badge--pill">Inactive</span>';
    }

    return element;
}

function updateHistoryFormat(item){
	var element = "";
	
	element += '<span class="kt-font-brand">' + dateFormat(item.lastUpdateDate) + '</span> - <span class="kt-font-brand kt-font-bold">' + item.lastUpdatedBy + '</span>';
	
	return element;
}