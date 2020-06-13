# JDK_Features
JAVA 8 and above Features

# Concepts covered are :
1- lamda Expression and method reference

2- Functional Interface and its different types
# 2(a)- Binary interface

Type Parameters:

T - the type of the operands and result of the operator

Functional Interface:
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

@FunctionalInterface

public interface BinaryOperator<T>
extends BiFunction<T,T,T>

Represents an operation upon two operands of the same type, producing a result of the same type as the operands. This is a specialization of BiFunction for the case where the operands and the result are all of the same type.

This is a functional interface whose functional method is BiFunction.apply(Object, Object).
# 2(b)- Functional Interface

Type Parameters:
T - the type of the input to the function

R - the type of the result of the function

Functional Interface:

This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

@FunctionalInterface

public interface Function<T,R>

# 2(c)- Unary operator

Type Parameters:
T - the type of the operand and result of the operator

All Superinterfaces:

Function<T,T>

Functional Interface:
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

# 2(d)- Predicate Inteface

Type Parameters:
T - the type of the input to the predicate

Functional Interface:

This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

@FunctionalInterface

public interface Predicate<T>

# 2(e)- Consumer Interface

Type Parameters:

T - the type of the input to the operation

Functional Interface:

This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

@FunctionalInterface

public interface Consumer<T>

# 2(f)- Supplier Interface

Type Parameters:

T - the type of results supplied by this supplier

Functional Interface:

This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

@FunctionalInterface
public interface Supplier<T>

Represents a supplier of results.

There is no requirement that a new or distinct result be returned each time the supplier is invoked.

This is a functional interface whose functional method is get().
