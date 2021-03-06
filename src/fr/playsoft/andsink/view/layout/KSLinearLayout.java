/**
 * 
 */
package fr.playsoft.andsink.view.layout;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class KSLinearLayout extends BaseListActivity {
	
	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.SetupLayoutListener#setupOthersInTitleBar()
	 */
	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.SetupLayoutListener#setupAboutContent()
	 */
	@Override
	public void setupAboutContent() {
		ACTIVITY_INFO = "LinearLayout is the most important layout of Android." +
				" We'll cover all attributes of this layout:<br />" +
				"- Vertical - Horizontal orientation<br />" +
				"- Set layout width & height with FILL_PARENT, WRAP_CONTENT<br />" +
				"- Set border space with Margin, Padding<br />" +
				"- Use Gravity for alignment<br />" +
				"- Layout weight<br />" +
				"- Customize layout with background<br />";
		
		ACTIVITY_USING_RES = 
				"<b>Java file:</b><br />" +
		 		"- KSLinearLayout.java (main)<br />" +
		 		"- BaseListActivity.java (parent)<br />" +
		 		"<b>Layout</b><br />" +
		 		"- ks_list_template (main)<br />" +
		 		"- ks_list_row.xml, ks_custom_titlebar<br />" +
		 		"<b>Drawable</b><br />" +
		 		"- ks_list_row_selector.xml<br />" +
		 		"<b>Menu</b><br />" +
		 		"- N/A<br />" +
		 		"<b>Anim</b><br />" +
		 		"- N/A<br />" +
		 		"<b>Android Manifest</b><br />" ;

	}

	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.BaseListActivity#setupListData()
	 */
	@Override
	public void setupListData() {
		
		LISTDATA.add(new String[] {"Layout width & height", 
				"Set width and height of linear layout", 
				"fr.playsoft.andsink.view.layout.LLWidthHeight"});
		LISTDATA.add(new String[] {"Vertical - Horizontal", 
				"Linear Layout in vertical & horizontal orientation",	
				"fr.playsoft.andsink.view.layout.LLOrientation"});
		
		LISTDATA.add(new String[] {"Padding - Margin", 
				"Demonstrate margin and padding property of layout", 
				"fr.playsoft.andsink.view.layout.LLMarginPadding"});
		
		LISTDATA.add(new String[] {"Gravity", 
				"Use layout gravity for alignment children with this layout", 
				"fr.playsoft.andsink.view.layout.LLGravity"});
		
		LISTDATA.add(new String[] {"Layout Gravity ^", 
				"Use layout layout_gravity for alignment this layout with its parent", 
				"fr.playsoft.andsink.view.layout.LLLayoutGravity"});
		
		LISTDATA.add(new String[] {"Layout weight", 
				"Use Layout weight to make layout expand to fill all remaining space in parent view", 
				"fr.playsoft.andsink.view.layout.LLWeight"});
		
		LISTDATA.add(new String[] {"Linear Layout Sample ^", 
				"Some sample Linear Layout", 
				"fr.playsoft.andsink.view.layout.LLSample"});
		
		
	}

	@Override
	public void setupTitleBarNameStr() {
		 ACTIVITY_NAME = "Linear Layout"; //Activity name 
		
	}

}
