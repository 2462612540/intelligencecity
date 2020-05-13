 //控制层 
app.controller('commonuserController' ,function($scope,$controller   ,commonuserService){

	//继承
	$controller('baseController',{$scope:$scope});
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		commonuserService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		commonuserService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		commonuserService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=commonuserService.update( $scope.entity ); //修改  
		}else{
			serviceObject=commonuserService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}

	//新增
	$scope.add=function(){
		commonuserService.add($scope.entity).success(
			function (response) {
				if(response.success){
					alert("注册成功！");
					location.href="../../../auth-login.html";
				}else {
					alert(response.measure);
				}
			}
		);
	};

	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		commonuserService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		commonuserService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	
