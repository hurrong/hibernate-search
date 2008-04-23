//$
package org.hibernate.search.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Documented;

/**
 * Reusable analyzer definition.
 * An analyzer definition defines:
 *  - one tokenizer
 *  - optionally some filters
 * Filters are applied in the order they are defined
 *
 * Reuses the Solr Tokenizer and Filter architecture
 *
 * @author Emmanuel Bernard
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( { ElementType.TYPE, ElementType.FIELD, ElementType.METHOD} )
@Documented
public @interface AnalyzerDef {
	/**
	 * Reference name to be used on {#org.hibernate.search.annotations.Analyzer}
	 */
	String name();

	/**
	 * Tokenizer used
	 */
	TokenizerDef tokenizer();

	/**
	 * Filters used. The filters are applied in the defined order
	 */
	TokenFilterDef[] filters() default {};
}
