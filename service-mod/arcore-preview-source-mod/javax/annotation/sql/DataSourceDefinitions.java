package javax.annotation.sql;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface DataSourceDefinitions
{
  DataSourceDefinition[] value();
}


/* Location:              /Users/tom/Downloads/dex2jar-2.0/classes.jar!/javax/annotation/sql/DataSourceDefinitions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */