package erumppe.dbt.page;

import erumppe.dbt.page.user;
import org.apache.click.control.PageLink;

public class HomePage extends BorderPage{
    public String title = "Home";
    public String user;
    
    private PageLink pageLink = new PageLink("UserLink", UserHomePage.class);
    
    @Override
    public void onInit()
    {
        user = getContext().getRequest().getRemoteUser();
    }
}
