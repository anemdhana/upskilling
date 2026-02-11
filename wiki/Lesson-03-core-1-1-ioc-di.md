# Lesson 03 - Core 1.1 IoC & DI

Progressive commit comparisons (local hashes):

1) Understanding IoC (Inversion of Control)
- Compare: 54feba7...4249926
- Notes: Container-managed inventory gateway and service.

2) BeanFactory vs ApplicationContext
- Compare: 4249926...3832131
- Notes: Side-by-side container access service.

3) Bean lifecycle and scopes
- Compare: 3832131...e5325a3
- Notes: Lifecycle callbacks and prototype scope examples.

4) Constructor-based dependency injection
- Compare: e5325a3...5d6e96d
- Notes: Billing service with immutable dependency.

5) Setter-based dependency injection
- Compare: 5d6e96d...4427f66
- Notes: Notification service with setter injection.

6) Field injection and best practices
- Compare: 4427f66...502511c
- Notes: Field injection demo with cautionary note.

7) Circular dependencies and resolution
- Compare: 502511c...4c20c97
- Notes: Lazy setter breaks a circular reference.

8) @Autowired, @Inject, @Resource
- Compare: 4c20c97...da82e6f
- Notes: Three DI annotations with a shared provider.

9) @Qualifier and @Primary
- Compare: da82e6f...945f5de
- Notes: Qualified JSON formatter vs primary formatter.

10) Optional dependencies
- Compare: 945f5de...0a513ce
- Notes: Optional audit sink with @Autowired(required = false).
