// @ExecutionModes({ON_SELECTED_NODE})
String ec = node.style.getEdge().getColorCode();
String bc = node.style.backgroundColorCode

if (bc == "#ffffff") {
  node.style.setBackgroundColor(node.style.getEdge().getColor());
} else {
  if (bc == ec) {
    node.style.setBackgroundColorCode("#ffffff");
  } else {
    node.style.setBackgroundColorCode(ec);
    node.style.getEdge().setColorCode(bc);
  }
}
