$(document).ready( function () {
    $('#datatable2').DataTable({
        language : {
            "lengthMenu" : '每页显示5条',
            "paginate" : {
                "first" : "首页",
                "last" : "尾页",
                "previous" : "上一页",
                "next" : "下一页"
            },
            "processing" : "加载中...",
            "emptyTable" : "暂无数据",
            "info" : "共 _PAGES_ 页  _TOTAL_ 条数据  ",
            "infoEmpty" : "暂无数据",
            "emptyTable" : "暂无要处理的数据...",
            "search": "搜索:",
            "infoFiltered" : " —— 从  _MAX_ 条数据中筛选",
            "zeroRecords":    "没有找到记录",
        },
        //不显示搜索框
        bFilter: false,
        //不显示lengthMenu
        bLengthChange:false,
        //每页显示5条
        iDisplayLength: 3,
        ajax: {
            url: "/barrel/findAll.do",
            dataSrc: ''
        },
        columns: [
            {
                "data": "id"
            },
            {
                "data": "barrelNumber"
            },
            {
                "data": "totalWeight"
            },
            {
                "data": "currentWeight"
            },
            {
                "data": "purity"
            },
            {
                "data": "restCapacity"
            },
            {
                "data": "location"
            }
        ]
    });
} );