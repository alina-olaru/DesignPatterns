We can break the pattern down into:

component
– is the base interface for all the objects in the composition.
It should be either an interface or an abstract class with the common methods to manage the child composites.
leaf
–implements the default behavior of the base component. It doesn't contain a reference to the other objects.
composite
– has leaf elements. It implements the base component methods and defines the child-related operations.
client
– has access to the composition elements by using the base component object.