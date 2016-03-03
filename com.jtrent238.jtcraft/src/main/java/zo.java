/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ public class zo
/*     */   extends zk
/*     */ {
/*     */   private add c;
/*     */   
/*     */   public zo(ahb paramahb)
/*     */   {
/*  24 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public zo(ahb paramahb, sv paramsv, int paramInt) {
/*  28 */     this(paramahb, paramsv, new add(ade.bn, 1, paramInt));
/*     */   }
/*     */   
/*     */   public zo(ahb paramahb, sv paramsv, add paramadd) {
/*  32 */     super(paramahb, paramsv);
/*     */     
/*  34 */     this.c = paramadd;
/*     */   }
/*     */   
/*     */   public zo(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/*  38 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3, new add(ade.bn, 1, paramInt));
/*     */   }
/*     */   
/*     */   public zo(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, add paramadd) {
/*  42 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*  43 */     this.c = paramadd;
/*     */   }
/*     */   
/*     */   protected float i()
/*     */   {
/*  48 */     return 0.05F;
/*     */   }
/*     */   
/*     */   protected float e()
/*     */   {
/*  53 */     return 0.5F;
/*     */   }
/*     */   
/*     */   protected float f()
/*     */   {
/*  58 */     return -20.0F;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  62 */     if (this.c == null) this.c = new add(ade.bn, 1, 0);
/*  63 */     this.c.b(paramInt);
/*     */   }
/*     */   
/*     */   public int k() {
/*  67 */     if (this.c == null) this.c = new add(ade.bn, 1, 0);
/*  68 */     return this.c.k();
/*     */   }
/*     */   
/*     */   protected void a(azu paramazu)
/*     */   {
/*  73 */     if (!this.o.E) {
/*  74 */       List localList1 = ade.bn.g(this.c);
/*     */       Iterator localIterator1;
/*  76 */       if ((localList1 != null) && (!localList1.isEmpty())) {
/*  77 */         azt localazt = this.C.b(4.0D, 2.0D, 4.0D);
/*  78 */         List localList2 = this.o.a(sv.class, localazt);
/*     */         
/*  80 */         if ((localList2 != null) && (!localList2.isEmpty()))
/*  81 */           for (localIterator1 = localList2.iterator(); localIterator1.hasNext();) { localsv = (sv)localIterator1.next();
/*  82 */             double d1 = f(localsv);
/*  83 */             if (d1 < 16.0D) {
/*  84 */               d2 = 1.0D - Math.sqrt(d1) / 4.0D;
/*  85 */               if (localsv == paramazu.g) {
/*  86 */                 d2 = 1.0D;
/*     */               }
/*     */               
/*  89 */               for (rw localrw : localList1) {
/*  90 */                 int i = localrw.a();
/*  91 */                 if (rv.a[i].b()) {
/*  92 */                   rv.a[i].a(j(), localsv, localrw.c(), d2);
/*     */                 } else {
/*  94 */                   int j = (int)(d2 * localrw.b() + 0.5D);
/*  95 */                   if (j > 20)
/*  96 */                     localsv.c(new rw(i, j, localrw.c()));
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */       }
/*     */       sv localsv;
/*     */       double d2;
/* 104 */       this.o.c(2002, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), k());
/*     */       
/* 106 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 112 */     super.a(paramdh);
/*     */     
/* 114 */     if (paramdh.b("Potion", 10)) {
/* 115 */       this.c = add.a(paramdh.m("Potion"));
/*     */     } else {
/* 117 */       a(paramdh.f("potionValue"));
/*     */     }
/*     */     
/* 120 */     if (this.c == null) B();
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 125 */     super.b(paramdh);
/* 126 */     if (this.c != null) paramdh.a("Potion", this.c.b(new dh()));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */