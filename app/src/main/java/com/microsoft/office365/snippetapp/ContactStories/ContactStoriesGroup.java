package com.microsoft.office365.snippetapp.ContactStories;

import com.microsoft.office365.snippetapp.helpers.BaseUserStory;

/**
 * Created by johnau on 5/18/2015.
 */
public class ContactStoriesGroup extends BaseUserStory {
    @Override
    public String execute() {
        return null;
    }

    @Override
    public String getDescription() {
        setGroupingFlag(true);
        return "Contact stories";
    }
}
