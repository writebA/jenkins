package org.example.jenkins.pages;


public enum MainPageNavigation {
    JAVASCRIPT_ALERT("JavaScript Alerts"),
    SORTABLE_DATA_TABLES("Sortable Data Tables");
    public final String label;

    private MainPageNavigation(String label) {
        this.label = label;
    }
}
