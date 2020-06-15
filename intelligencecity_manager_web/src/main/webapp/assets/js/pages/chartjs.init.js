!function (l) {
    "use strict";

    function o() {
        this.$body = l("body"), this.charts = []
    }

    o.prototype.respChart = function (r, a, e, t) {
        var n = Chart.controllers.line.prototype.draw;
        Chart.controllers.line.prototype.draw = function () {
            n.apply(this, arguments);
            var o = this.chart.chart.ctx, r = o.stroke;
            o.stroke = function () {
                o.save(), o.shadowBlur = 10, o.shadowOffsetX = 0, o.shadowOffsetY = 4, r.apply(this, arguments), o.restore()
            }
        };
        var i = r.get(0).getContext("2d"), s = l(r).parent();
        return function () {
            var o;
            switch (r.attr("width", l(s).width()), a) {
                case"Line":
                    o = new Chart(i, {type: "line", data: e, options: t});
                    break;
                case"Doughnut":
                    o = new Chart(i, {type: "doughnut", data: e, options: t});
                    break;
                case"Pie":
                    o = new Chart(i, {type: "pie", data: e, options: t});
                    break;
                case"Bar":
                    o = new Chart(i, {type: "bar", data: e, options: t});
                    break;
                case"Radar":
                    o = new Chart(i, {type: "radar", data: e, options: t});
                    break;
                case"PolarArea":
                    o = new Chart(i, {data: e, type: "polarArea", options: t})
            }
            return o
        }()
    }, o.prototype.initCharts = function () {
        var o = [], r = document.getElementById("line-chart-example").getContext("2d"),
            a = r.createLinearGradient(500, 0, 100, 0);
        a.addColorStop(0, "#1a1b62"), a.addColorStop(1, "#4483c6");
        var e = r.createLinearGradient(500, 0, 100, 0);
        e.addColorStop(0, "#4483c6"), e.addColorStop(1, "#1a1b62");
        var t = {
            labels: ["01", "02", "03", "04", "05", "06", "07"],
            datasets: [{
                label: "Sales",
                fill: !1,
                borderColor: a,
                pointBorderColor: a,
                pointBackgroundColor: a,
                pointHoverBackgroundColor: a,
                pointHoverBorderColor: a,
                data: [88, 92, 61, 5, 49, 92, 54]
            }, {
                label: "Sales",
                fill: !1,
                borderColor: e,
                pointBorderColor: e,
                pointBackgroundColor: e,
                pointHoverBackgroundColor: e,
                pointHoverBorderColor: e,
                data: [44, 10, 81, 61, 63, 5, 85]
            }]
        };
        o.push(this.respChart(l("#line-chart-example"), "Line", t, {
            maintainAspectRatio: !1,
            responsive: !0,
            legend: {display: !1},
            animation: {easing: "easeInOutBack"},
            scales: {
                yAxes: [{
                    display: !1,
                    ticks: {
                        fontColor: "rgba(0,0,0,0.5)",
                        fontStyle: "bold",
                        beginAtZero: !0,
                        maxTicksLimit: 5,
                        padding: 0
                    },
                    gridLines: {drawTicks: !1, display: !1}
                }],
                xAxes: [{
                    display: !1,
                    gridLines: {zeroLineColor: "transparent"},
                    ticks: {padding: 0, fontColor: "rgba(0,0,0,0.5)", fontStyle: "bold"}
                }]
            }
        }));
        o.push(this.respChart(l("#bar-chart-example"), "Bar", {
            labels: ["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"],
            datasets: [{
                label: "Sales Analytics",
                backgroundColor: "#36BE93",
                borderColor: "#36BE93",
                borderWidth: 1,
                hoverBackgroundColor: "#36BE93",
                hoverBorderColor: "#36BE93",
                data: [81, 56, 89, 40, 32, 65, 59, 80, 81, 56, 89, 60]
            }]
        }, {
            maintainAspectRatio: !1,
            legend: {display: !1},
            scales: {
                yAxes: [{gridLines: {display: !1}, ticks: {max: 100, min: 20, stepSize: 20}}],
                xAxes: [{barPercentage: .2, gridLines: {color: "rgba(0,0,0,0.05)"}}]
            }
        }));
        var n = document.getElementById("area-chart-example").getContext("2d").createLinearGradient(0, 300, 0, 100);
        n.addColorStop(0, "#4482C5"), n.addColorStop(1, "#02A8B5");
        var i = {
            labels: ["", "", "", "", "", "", "", ""],
            datasets: [{
                label: "Conversion Funnels",
                fill: !0,
                backgroundColor: n,
                borderColor: n,
                pointBorderColor: n,
                pointBackgroundColor: n,
                pointHoverBackgroundColor: "transparent",
                pointHoverBorderColor: "transparent",
                data: [14, 26, 62, 60, 65, 60, 34, 28]
            }]
        };
        o.push(this.respChart(l("#area-chart-example"), "Line", i, {
            maintainAspectRatio: !1,
            legend: {display: !1},
            animation: {easing: "easeInOutBack"},
            elements: {point: {radius: 0, hitRadius: 10, hoverRadius: 5}},
            tooltips: {enabled: !1},
            scales: {
                yAxes: [{display: !1, ticks: {suggestedMin: 0}}],
                xAxes: [{
                    scaleShowLabels: !1,
                    gridLines: {zeroLineColor: "transparent"},
                    ticks: {padding: -28, fontColor: "#dee2e6", fontStyle: "bold"}
                }]
            }
        }));
        o.push(this.respChart(l("#doughnut"), "Doughnut", {
            labels: ["Wallet Balance", "Travels", "Food & Drinks"],
            datasets: [{
                data: [150, 150, 150],
                backgroundColor: ["#FBCC5C", "#31CE77", "#6B5EAE"],
                borderColor: "transparent",
                borderWidth: "3"
            }]
        }, {maintainAspectRatio: !1, cutoutPercentage: 80, legend: {display: !1}}));
        o.push(this.respChart(l("#radar-chart-example"), "Radar", {
            labels: ["Eating", "Drinking", "Sleeping", "Designing", "Coding", "Cycling", "Running"],
            datasets: [{
                label: "Desktops",
                backgroundColor: "rgba(89, 193, 115,0.2)",
                borderColor: "#59C173",
                pointBackgroundColor: "#59C173",
                pointBorderColor: "#fff",
                pointHoverBackgroundColor: "#fff",
                pointHoverBorderColor: "#59C173",
                data: [65, 59, 90, 81, 56, 55, 40]
            }, {
                label: "Tablets",
                backgroundColor: "rgba(161, 127, 224,0.2)",
                borderColor: "#a17fe0",
                pointBackgroundColor: "#a17fe0",
                pointBorderColor: "#fff",
                pointHoverBackgroundColor: "#fff",
                pointHoverBorderColor: "#a17fe0",
                data: [28, 48, 40, 19, 96, 27, 100]
            }]
        }));
        return o.push(this.respChart(l("#filled-line-chart"), "Line", {
            labels: ["01", "02", "03", "04", "05", "06", "07", "08", "09"],
            datasets: [{
                label: "Downloads",
                fill: !0,
                backgroundColor: "rgba(101, 78, 163, 0.2)",
                borderColor: "#654ea3",
                borderWidth: 2,
                lineTension: 0,
                pointBorderWidth: 2,
                pointBackgroundColor: "#fff",
                pointBorderColor: "#654ea3",
                pointRadius: 3,
                pointHitRadius: 3,
                data: [65, 59, 80, 81, 56, 55, 40, 35, 30]
            }, {
                label: "Uploads",
                fill: !0,
                backgroundColor: "rgba(0, 131, 176, 0.2)",
                borderColor: "#0083B0",
                borderWidth: 2,
                lineTension: 0,
                pointBorderWidth: 2,
                pointBackgroundColor: "#fff",
                pointBorderColor: "#0083B0",
                pointRadius: 3,
                pointHitRadius: 3,
                data: [22, 28, 42, 38, 12, 22, 18, 9, 3]
            }]
        }, {
            maintainAspectRatio: !1,
            legend: {display: !1},
            animation: {easing: "easeInOutBack"},
            plugins: {filler: {propagate: !1}},
            scales: {
                yAxes: [{
                    display: !1,
                    ticks: {fontColor: "rgba(0,0,0,0.5)", fontStyle: "bold", beginAtZero: !0, padding: 0},
                    gridLines: {drawTicks: !1, display: !1}
                }],
                xAxes: [{
                    display: !0,
                    gridLines: {zeroLineColor: "transparent"},
                    ticks: {padding: 5, fontColor: "rgba(0,0,0,0.5)", fontStyle: "bold"}
                }]
            }
        })), o
    }, o.prototype.init = function () {
        var r = this;
        r.charts = this.initCharts(), l(window).on("resize", function (o) {
            l.each(r.charts, function (o, r) {
                try {
                    r.destroy()
                } catch (o) {
                    console.log(o)
                }
            }), r.charts = r.initCharts()
        })
    }, l.ChartJs = new o, l.ChartJs.Constructor = o
}(window.jQuery), function () {
    "use strict";
    window.jQuery.ChartJs.init()
}();