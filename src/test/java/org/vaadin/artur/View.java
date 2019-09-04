package org.vaadin.artur;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends VerticalLayout {

    public View() {
        setAlignItems(Alignment.CENTER);
        add(new Avataaar("Hello"));
        add(new Paragraph("Hello"));
        add(new Avataaar("Vaadin"));
        add(new Paragraph("Vaadin"));
        add(new Avataaar("Hello Vaadin"));
        add(new Paragraph("Hello Vaadin"));
    }
}
