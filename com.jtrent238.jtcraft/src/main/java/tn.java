/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class tn implements ti
/*     */ {
/*     */   private final tl a;
/*     */   private final th b;
/*  10 */   private final Map c = com.google.common.collect.Maps.newHashMap();
/*  11 */   private final Map d = com.google.common.collect.Maps.newHashMap();
/*  12 */   private final Map e = com.google.common.collect.Maps.newHashMap();
/*     */   private double f;
/*  14 */   private boolean g = true;
/*     */   private double h;
/*     */   
/*     */   public tn(tl paramtl, th paramth) {
/*  18 */     this.a = paramtl;
/*  19 */     this.b = paramth;
/*  20 */     this.f = paramth.b();
/*     */     
/*  22 */     for (int i = 0; i < 3; i++) {
/*  23 */       this.c.put(Integer.valueOf(i), new java.util.HashSet());
/*     */     }
/*     */   }
/*     */   
/*     */   public th a()
/*     */   {
/*  29 */     return this.b;
/*     */   }
/*     */   
/*     */   public double b()
/*     */   {
/*  34 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble)
/*     */   {
/*  39 */     if (paramDouble == b()) return;
/*  40 */     this.f = paramDouble;
/*  41 */     f();
/*     */   }
/*     */   
/*     */   public Collection a(int paramInt)
/*     */   {
/*  46 */     return (Collection)this.c.get(Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public Collection c()
/*     */   {
/*  51 */     java.util.HashSet localHashSet = new java.util.HashSet();
/*     */     
/*  53 */     for (int i = 0; i < 3; i++) {
/*  54 */       localHashSet.addAll(a(i));
/*     */     }
/*     */     
/*  57 */     return localHashSet;
/*     */   }
/*     */   
/*     */   public tj a(java.util.UUID paramUUID)
/*     */   {
/*  62 */     return (tj)this.e.get(paramUUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(tj paramtj)
/*     */   {
/*  74 */     if (a(paramtj.a()) != null) { throw new IllegalArgumentException("Modifier is already applied on this attribute!");
/*     */     }
/*  76 */     Object localObject = (Set)this.d.get(paramtj.b());
/*     */     
/*  78 */     if (localObject == null) {
/*  79 */       localObject = new java.util.HashSet();
/*  80 */       this.d.put(paramtj.b(), localObject);
/*     */     }
/*     */     
/*  83 */     ((Set)this.c.get(Integer.valueOf(paramtj.c()))).add(paramtj);
/*  84 */     ((Set)localObject).add(paramtj);
/*  85 */     this.e.put(paramtj.a(), paramtj);
/*     */     
/*  87 */     f();
/*     */   }
/*     */   
/*     */   private void f() {
/*  91 */     this.g = true;
/*  92 */     this.a.a(this);
/*     */   }
/*     */   
/*     */   public void b(tj paramtj)
/*     */   {
/*  97 */     for (int i = 0; i < 3; i++) {
/*  98 */       Set localSet2 = (Set)this.c.get(Integer.valueOf(i));
/*  99 */       localSet2.remove(paramtj);
/*     */     }
/*     */     
/* 102 */     Set localSet1 = (Set)this.d.get(paramtj.b());
/*     */     
/* 104 */     if (localSet1 != null) {
/* 105 */       localSet1.remove(paramtj);
/*     */       
/* 107 */       if (localSet1.isEmpty()) {
/* 108 */         this.d.remove(paramtj.b());
/*     */       }
/*     */     }
/*     */     
/* 112 */     this.e.remove(paramtj.a());
/* 113 */     f();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void d()
/*     */   {
/* 141 */     Object localObject = c();
/* 142 */     if (localObject == null) { return;
/*     */     }
/* 144 */     localObject = new java.util.ArrayList((Collection)localObject);
/*     */     
/* 146 */     for (tj localtj : (Collection)localObject) {
/* 147 */       b(localtj);
/*     */     }
/*     */   }
/*     */   
/*     */   public double e()
/*     */   {
/* 153 */     if (this.g) {
/* 154 */       this.h = g();
/* 155 */       this.g = false;
/*     */     }
/*     */     
/* 158 */     return this.h;
/*     */   }
/*     */   
/*     */   private double g() {
/* 162 */     double d1 = b();
/*     */     
/* 164 */     for (tj localtj1 : a(0)) {
/* 165 */       d1 += localtj1.d();
/*     */     }
/*     */     
/* 168 */     double d2 = d1;
/*     */     
/* 170 */     for (Iterator localIterator2 = a(1).iterator(); localIterator2.hasNext();) { localtj2 = (tj)localIterator2.next();
/* 171 */       d2 += d1 * localtj2.d();
/*     */     }
/*     */     tj localtj2;
/* 174 */     for (localIterator2 = a(2).iterator(); localIterator2.hasNext();) { localtj2 = (tj)localIterator2.next();
/* 175 */       d2 *= (1.0D + localtj2.d());
/*     */     }
/*     */     
/* 178 */     return this.b.a(d2);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */