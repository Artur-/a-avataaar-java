package org.vaadin.artur;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * d An Avatar which is generated based on a string so that the same string
 * always generates the same, random avatar image.
 */
@Tag("a-avataaar")
@JsModule("a-avataaar/a-avataaar.js")
@NpmPackage(value = "a-avataaar", version = "1.2.5")
public class Avataaar extends Component {

    PropertyDescriptor<String, String> identifierProperty = PropertyDescriptors.propertyWithDefault("identifier", "");

    /**
     * Creates an avatar without any identifier.
     * 
     * Use {@link #setIdentifier(String)} to define the identifier to use.
     */
    public Avataaar() {
    }

    /**
     * Creates an avatar using the given identifier for generating the image.
     * 
     * @param identifier the identifier
     */
    public Avataaar(String identifier) {
        setIdentifier(identifier);
    }

    /**
     * Sets the identifier string used for generating the avatar image.
     * 
     * Any given string will always generate the same avatar.
     * 
     * @param identifier the identifier
     */
    public void setIdentifier(String identifier) {
        identifierProperty.set(this, identifier);
    }

    /**
     * Gets the identifier string used for generating the avatar image.
     * 
     * @return the identifier
     */
    public String getIdentifier() {
        return identifierProperty.get(this);
    }

}
