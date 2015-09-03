package com.wmoreira.javadevn1.business.component;

import com.wmoreira.javadevn1.business.entity.ZipCode;

/**
 * @author wellington.362@gmail.com
 */
public interface ZipCodeComponent {
    ZipCode find(String zipCode);
    ZipCode lookup(String zipCode);
}
