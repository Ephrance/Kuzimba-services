window.onload = function () {

var chart = new CanvasJS.Chart("chartContainer", {
  exportEnabled: true,
  animationEnabled: true,
  title:{
    text: "Cash In"
  },
 
  axisX: {
    title: "Weeks"
  },
  axisY: {
    title: "Amount (UGX)",
    titleFontColor: "#800000",
    lineColor: "#4F81BC",
    labelFontColor: "#4F81BC",
    tickColor: "#red"
  },
  
  toolTip: {
    shared: true
  },
 
  data: [{
    type: "column",
    showInLegend: true,      
    yValueFormatString: "#,##0.# Units",
    dataPoints: [
      { label: "week 1",  y: 19034.5 },
      { label: "week 2", y: 20015 },
      { label: "week 3", y: 25342 },
      { label: "week 4",  y: 20088 },
      { label: "week 5",  y: 28234 }
    ]
  },
]
});
chart.render();



}