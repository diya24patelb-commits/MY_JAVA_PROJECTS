import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
// NotBlank annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotBlank {
}
// MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
int value();
}
// SignupForm class
class SignupForm {
@NotBlank
 String name;
@NotBlank
@MaxLength(10)
String username;
@NotBlank
@MaxLength(20)
String password;
SignupForm(String name, String username, String password) {