$(function () {
    char1();
    char2();
    char3();
    char4();

});

//统计分析图
function char1() {

    var myChart = echarts.init($("#char1")[0]);

    option = {
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}: {c}台 ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'right',
            textStyle: {
                color: '#ffffff',
            },
            data: ['长宁区', '宝山区', '静安区', '杨浦区']
        },

        calculable: false,
        series: [
            {
                name: '设备分布统计',
                type: 'pie',
                radius: ['40%', '70%'],
                itemStyle: {
                    normal: {
                        label: {
                            show: false
                        },
                        labelLine: {
                            show: false
                        }
                    },
                    emphasis: {
                        label: {
                            show: true,
                            position: 'center',
                            textStyle: {
                                fontSize: '20',
                                fontWeight: 'bold'
                            }
                        }
                    }
                },
                data: [
                    {value: 335, name: '长宁区'},
                    {value: 310, name: '宝山区'},
                    {value: 234, name: '静安区'},
                    {value: 135, name: '杨浦区'}
                ]
            }
        ]
    };

    myChart.setOption(option);
    window.addEventListener('resize', function () {
        myChart.resize();
    })

}

function char2() {

    var myChart = echarts.init($("#char2")[0]);

    option = {
        tooltip: {
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        grid: {show: 'true', borderWidth: '0'},
        legend: {
            data: ['湿垃圾', '干垃圾', '有害垃圾', '可回收'],
            textStyle: {
                color: '#ffffff',
            }
        },

        calculable: false,
        xAxis: [
            {
                type: 'value',
                axisLabel: {
                    show: true,
                    textStyle: {
                        color: '#fff'
                    }
                },
                splitLine: {
                    lineStyle: {
                        color: ['#f2f2f2'],
                        width: 0,
                        type: 'solid'
                    }
                }

            }
        ],
        yAxis: [
            {
                type: 'category',
                data: ['湿垃圾', '干垃圾', '有害垃圾', '可回收垃圾'],
                axisLabel: {
                    show: true,
                    textStyle: {
                        color: '#fff'
                    }
                },
                splitLine: {
                    lineStyle: {
                        width: 0,
                        type: 'solid'
                    }
                }
            }
        ],
        series: [
            {
                name: '垃圾质量',
                type: 'bar',
                stack: '总量',
                itemStyle: {normal: {label: {show: true, position: 'insideRight'}}},
                data: [580, 180, 50, 200]
            },
        ]
    };

    myChart.setOption(option);
    window.addEventListener('resize', function () {
        myChart.resize();
    })

}

function char3() {

    var myChart = echarts.init($("#char3")[0]);

    option = {
        legend: {
            data: ['垃圾纯净度'],
            textStyle: {
                color: '#ffffff',

            }
        },
        grid: {show: 'true', borderWidth: '0'},

        calculable: false,
        tooltip: {
            trigger: 'axis',
            formatter: "纯净度 : <br/>{b} : {c}%"
        },
        xAxis: [
            {
                type: 'category',
                axisLine: {onZero: false},
                axisLabel: {
                    formatter: '{value}',
                    textStyle: {
                        color: '#fff'
                    }
                },
                splitLine: {
                    lineStyle: {
                        width: 0,
                        type: 'solid'
                    }
                },
                boundaryGap: false,
                data: [6, 8, 10, 12, 14, 16, 18, 20, 22]
            }
        ],
        yAxis: [
            {
                type: 'value',
                axisLabel: {
                    formatter: '{value}%',
                    textStyle: {
                        color: '#fff'
                    }
                },

                splitLine: {
                    lineStyle: {
                        width: 0,
                        type: 'solid'
                    }
                }
            }
        ],
        series: [
            {
                name: '车辆行驶数量',
                type: 'line',
                smooth: true,
                itemStyle: {
                    normal: {
                        lineStyle: {
                            shadowColor: 'rgba(0,0,0,0.4)'
                        }
                    }
                },
                data: ['0', '86.36', '90.36', '95.74', '90.35', '94.52', '90.36', '90.65', '95.54']
            }
        ]
    };
    myChart.setOption(option);
    window.addEventListener('resize', function () {
        myChart.resize();
    })

}

function char4() {

    var myChart = echarts.init($("#char4")[0]);

    option = {
        grid: {show: 'true', borderWidth: '0'},
        tooltip: {
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            },

            formatter: function (params) {
                var tar = params[0];
                return tar.name + '<br/>' + tar.seriesName + ' : ' + tar.value;
            }
        },

        xAxis: [
            {
                type: 'category',
                axisLine: {onZero: false},
                axisLabel: {
                    formatter: '{value}',
                    textStyle: {
                        color: '#fff'
                    }
                },
                splitLine: {
                    lineStyle: {
                        width: 0,
                        type: 'solid'
                    }
                },
                boundaryGap: false,
                data: [6, 8, 10, 12, 14, 16, 18, 20, 22]
            }
        ],
        yAxis: [
            {
                type: 'value',
                axisLabel: {
                    formatter: '{value}L',
                    textStyle: {
                        color: '#fff'
                    }
                },

                splitLine: {
                    lineStyle: {
                        width: 0,
                        type: 'solid'
                    }
                }
            }
        ],
        series: [
            {
                name: '垃圾桶的容量',
                type: 'line',
                smooth: true,
                itemStyle: {
                    normal: {
                        lineStyle: {
                            shadowColor: 'rgba(0,0,0,0.4)'
                        }
                    }
                },
                data: ['0', '30', '50', '70', '90', '120', '160', '200', '240']
            }
        ]
    };

    myChart.setOption(option);
    window.addEventListener('resize', function () {
        myChart.resize();
    })

}
