 function cinputGraph() {

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
      { label: "week 1",  y: 10 },
      { label: "week 2", y: 25 },
      { label: "week 3", y: 15 },
      { label: "week 4",  y: 29 },
      { label: "week 5",  y: 2 }
    ]
  }
]
});
chart.render();



}