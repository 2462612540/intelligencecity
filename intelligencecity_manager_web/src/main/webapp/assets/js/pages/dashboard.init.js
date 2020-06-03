!function (d) {
    "use strict";

    function t() {
        this.$body = d("body"), this.charts = []
    }

    t.prototype.respChart = function (a, r, o, e) {
        var n = Chart.controllers.line.prototype.draw;
        Chart.controllers.line.prototype.draw = function () {
            n.apply(this, arguments);
            var t = this.chart.chart.ctx, a = t.stroke;
            t.stroke = function () {
                t.save(), t.shadowBlur = 10, t.shadowOffsetX = 0, t.shadowOffsetY = 4, a.apply(this, arguments), t.restore()
            }
        };
        var i = a.get(0).getContext("2d"), s = d(a).parent();
        return function () {
            var t;
            switch (a.attr("width", d(s).width()), r) {
                case"Line":
                    t = new Chart(i, {type: "line", data: o, options: e});
                    break;
                case"Doughnut":
                    t = new Chart(i, {type: "doughnut", data: o, options: e});
                    break;
                case"Pie":
                    t = new Chart(i, {type: "pie", data: o, options: e});
                    break;
                case"Bar":
                    t = new Chart(i, {type: "bar", data: o, options: e});
                    break;
                case"Radar":
                    t = new Chart(i, {type: "radar", data: o, options: e});
                    break;
                case"PolarArea":
                    t = new Chart(i, {data: o, type: "polarArea", options: e})
            }
            return t
        }()
    }, t.prototype.initCharts = function () {
        var t = [],
            a = (o = document.getElementById("product-chart").getContext("2d")).createLinearGradient(0, 300, 0, 100);
        a.addColorStop(0, "#51A1DD"), a.addColorStop(1, "#71D0F2");
        var r = {
            labels: ["01", "02", "03", "04", "05", "06"],
            datasets: [{
                label: "Chart Analytics",
                backgroundColor: a,
                borderColor: a,
                borderWidth: 1,
                hoverBackgroundColor: a,
                hoverBorderColor: a,
                data: [75, 59, 76, 90, 56, 75]
            }]
        };
        t.push(this.respChart(d("#product-chart"), "Bar", r, {
            maintainAspectRatio: !1,
            legend: {display: !1},
            scales: {
                yAxes: [{gridLines: {display: !1}, ticks: {max: 100, min: 20, fontColor: "#fff", stepSize: 20}}],
                xAxes: [{barPercentage: .7, gridLines: {color: "rgba(27,29,100,0.2)"}, ticks: {fontColor: "#fff"}}]
            }
        }));
        var o,
            e = (o = document.getElementById("line-chart-static").getContext("2d")).createLinearGradient(500, 0, 100, 0);
        e.addColorStop(0, "#1a1b62"), e.addColorStop(1, "#4483c6");
        var n = o.createLinearGradient(500, 0, 100, 0);
        n.addColorStop(0, "#4483c6"), n.addColorStop(1, "#1a1b62");
        var i = {
            labels: ["01", "02", "03", "04", "05", "06", "07"],
            datasets: [{
                label: "Views",
                fill: !1,
                borderColor: e,
                pointBorderColor: e,
                pointBackgroundColor: e,
                pointHoverBackgroundColor: e,
                pointHoverBorderColor: e,
                data: [88, 92, 61, 5, 49, 92, 54]
            }, {
                label: "Earning",
                fill: !1,
                borderColor: n,
                pointBorderColor: n,
                pointBackgroundColor: n,
                pointHoverBackgroundColor: n,
                pointHoverBorderColor: n,
                data: [44, 10, 81, 61, 63, 5, 85]
            }]
        };
        t.push(this.respChart(d("#line-chart-static"), "Line", i, {
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
        t.push(this.respChart(d("#doughnut"), "Doughnut", {
            labels: ["Upload", "Download"],
            datasets: [{
                data: [40, 60],
                backgroundColor: ["#67C2EB", "#FF679B"],
                borderColor: "transparent",
                borderWidth: "3"
            }]
        }, {maintainAspectRatio: !1, cutoutPercentage: 80, legend: {display: !1}}))
    }, t.prototype.init = function () {
        d("#datatable").DataTable({pageLength: 5, searching: !1, lengthChange: !1});
        var a = this;
        a.charts = this.initCharts(), d(window).on("resize", function (t) {
            d.each(a.charts, function (t, a) {
                try {
                    a.destroy()
                } catch (t) {
                    console.log(t)
                }
            }), a.charts = a.initCharts()
        })
    }, d.Dashboard = new t, d.Dashboard.Constructor = t
}(window.jQuery), function (t) {
    "use strict";
    t(function () {
        t("#inline-datepicker-example").length && t("#inline-datepicker-example").datepicker({
            enableOnReadonly: !0,
            todayHighlight: !0,
            templates: {
                leftArrow: '<i class="mdi mdi-chevron-left"></i>',
                rightArrow: '<i class="mdi mdi-chevron-right"></i>'
            }
        })
    })
}(jQuery), function () {
    "use strict";
    window.jQuery.Dashboard.init()
}();