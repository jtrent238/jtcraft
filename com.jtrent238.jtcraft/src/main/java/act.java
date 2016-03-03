/*     */ import java.util.List;
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
/*     */ public class act
/*     */   extends acx
/*     */ {
/*     */   private final boolean b;
/*     */   
/*     */   public act(boolean paramBoolean)
/*     */   {
/*  21 */     super(0, 0.0F, false);
/*     */     
/*  23 */     this.b = paramBoolean;
/*     */   }
/*     */   
/*     */   public int g(add paramadd)
/*     */   {
/*  28 */     acu localacu = acu.a(paramadd);
/*     */     
/*  30 */     if ((this.b) && (localacu.i())) {
/*  31 */       return localacu.e();
/*     */     }
/*  33 */     return localacu.c();
/*     */   }
/*     */   
/*     */ 
/*     */   public float h(add paramadd)
/*     */   {
/*  39 */     acu localacu = acu.a(paramadd);
/*     */     
/*  41 */     if ((this.b) && (localacu.i())) {
/*  42 */       return localacu.f();
/*     */     }
/*  44 */     return localacu.d();
/*     */   }
/*     */   
/*     */ 
/*     */   public String i(add paramadd)
/*     */   {
/*  50 */     if (acu.a(paramadd) == acu.d) {
/*  51 */       return aen.m;
/*     */     }
/*  53 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(rg paramrg)
/*     */   {
/*  59 */     for (acu localacu : ) {
/*  60 */       localacu.a(paramrg);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/*  66 */     acu localacu = acu.a(paramadd);
/*     */     
/*  68 */     if (localacu == acu.d) {
/*  69 */       paramyz.c(new rw(rv.u.H, 1200, 3));
/*  70 */       paramyz.c(new rw(rv.s.H, 300, 2));
/*  71 */       paramyz.c(new rw(rv.k.H, 300, 1));
/*     */     }
/*     */     
/*  74 */     super.c(paramadd, paramahb, paramyz);
/*     */   }
/*     */   
/*     */   public rf b_(int paramInt)
/*     */   {
/*  79 */     acu localacu = acu.a(paramInt);
/*     */     
/*  81 */     if ((this.b) && (localacu.i())) {
/*  82 */       return localacu.h();
/*     */     }
/*  84 */     return localacu.g();
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/*  90 */     for (acu localacu : ) {
/*  91 */       if ((!this.b) || (localacu.i())) {
/*  92 */         paramList.add(new add(this, 1, localacu.a()));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public String a(add paramadd)
/*     */   {
/*  99 */     acu localacu = acu.a(paramadd);
/* 100 */     return a() + "." + localacu.b() + "." + ((this.b) && (localacu.i()) ? "cooked" : "raw");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\act.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */