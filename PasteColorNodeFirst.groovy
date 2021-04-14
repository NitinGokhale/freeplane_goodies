import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection

// define static functions to get and set clipboard text
static void setClipboardContents(final String contents){Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(contents), null)}
static String getClipboardContents(){return Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)}

// @ExecutionModes({ON_SELECTED_NODE})
String cc = getClipboardContents().toLowerCase();
def bc = node.style.getBackgroundColorCode();
def ec = node.style.getEdge().getColorCode();


if (cc == bc) {
  if (cc != "#ffffff") {
    node.style.getEdge().setColorCode(bc);
  }
} else {
  node.style.backgroundColorCode = cc;
}
// print "${node.id}\n";
