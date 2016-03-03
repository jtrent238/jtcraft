/*     */ import java.util.ArrayList;
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
/*     */ public class aps
/*     */   extends aor
/*     */ {
/*     */   private aji a;
/*     */   private int i;
/*     */   private int j;
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   private float m;
/*     */   private float n;
/*     */   
/*     */   public aps() {}
/*     */   
/*     */   public aps(aji paramaji, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/*  28 */     this.a = paramaji;
/*  29 */     this.i = paramInt1;
/*  30 */     this.j = paramInt2;
/*  31 */     this.k = paramBoolean1;
/*  32 */     this.l = paramBoolean2;
/*     */   }
/*     */   
/*     */   public aji a()
/*     */   {
/*  37 */     return this.a;
/*     */   }
/*     */   
/*     */   public int p()
/*     */   {
/*  42 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  46 */     return this.k;
/*     */   }
/*     */   
/*     */   public int c() {
/*  50 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  54 */     return this.l;
/*     */   }
/*     */   
/*     */   public float a(float paramFloat) {
/*  58 */     if (paramFloat > 1.0F) {
/*  59 */       paramFloat = 1.0F;
/*     */     }
/*  61 */     return this.n + (this.m - this.n) * paramFloat;
/*     */   }
/*     */   
/*     */   public float b(float paramFloat) {
/*  65 */     if (this.k) {
/*  66 */       return (a(paramFloat) - 1.0F) * q.b[this.j];
/*     */     }
/*  68 */     return (1.0F - a(paramFloat)) * q.b[this.j];
/*     */   }
/*     */   
/*     */   public float c(float paramFloat)
/*     */   {
/*  73 */     if (this.k) {
/*  74 */       return (a(paramFloat) - 1.0F) * q.c[this.j];
/*     */     }
/*  76 */     return (1.0F - a(paramFloat)) * q.c[this.j];
/*     */   }
/*     */   
/*     */   public float d(float paramFloat)
/*     */   {
/*  81 */     if (this.k) {
/*  82 */       return (a(paramFloat) - 1.0F) * q.d[this.j];
/*     */     }
/*  84 */     return (1.0F - a(paramFloat)) * q.d[this.j];
/*     */   }
/*     */   
/*     */ 
/*  88 */   private List o = new ArrayList();
/*     */   
/*     */   private void a(float paramFloat1, float paramFloat2) {
/*  91 */     if (this.k) {
/*  92 */       paramFloat1 = 1.0F - paramFloat1;
/*     */     } else {
/*  94 */       paramFloat1 -= 1.0F;
/*     */     }
/*     */     
/*     */ 
/*  98 */     azt localazt = ajn.M.a(this.b, this.c, this.d, this.e, this.a, paramFloat1, this.j);
/*  99 */     if (localazt != null)
/*     */     {
/* 101 */       List localList = this.b.b(null, localazt);
/* 102 */       if (!localList.isEmpty()) {
/* 103 */         this.o.addAll(localList);
/*     */         
/* 105 */         for (sa localsa : this.o) {
/* 106 */           localsa.d(paramFloat2 * q.b[this.j], paramFloat2 * q.c[this.j], paramFloat2 * q.d[this.j]);
/*     */         }
/* 108 */         this.o.clear();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void f() {
/* 114 */     if ((this.n < 1.0F) && (this.b != null)) {
/* 115 */       this.n = (this.m = 1.0F);
/* 116 */       this.b.p(this.c, this.d, this.e);
/* 117 */       s();
/* 118 */       if (this.b.a(this.c, this.d, this.e) == ajn.M) {
/* 119 */         this.b.d(this.c, this.d, this.e, this.a, this.i, 3);
/* 120 */         this.b.e(this.c, this.d, this.e, this.a);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 127 */     this.n = this.m;
/*     */     
/* 129 */     if (this.n >= 1.0F) {
/* 130 */       a(1.0F, 0.25F);
/* 131 */       this.b.p(this.c, this.d, this.e);
/* 132 */       s();
/* 133 */       if (this.b.a(this.c, this.d, this.e) == ajn.M) {
/* 134 */         this.b.d(this.c, this.d, this.e, this.a, this.i, 3);
/* 135 */         this.b.e(this.c, this.d, this.e, this.a);
/*     */       }
/* 137 */       return;
/*     */     }
/*     */     
/* 140 */     this.m += 0.5F;
/* 141 */     if (this.m >= 1.0F) {
/* 142 */       this.m = 1.0F;
/*     */     }
/*     */     
/* 145 */     if (this.k) {
/* 146 */       a(this.m, this.m - this.n + 0.0625F);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/* 153 */     super.a(paramdh);
/*     */     
/* 155 */     this.a = aji.e(paramdh.f("blockId"));
/* 156 */     this.i = paramdh.f("blockData");
/* 157 */     this.j = paramdh.f("facing");
/* 158 */     this.n = (this.m = paramdh.h("progress"));
/* 159 */     this.k = paramdh.n("extending");
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 164 */     super.b(paramdh);
/*     */     
/* 166 */     paramdh.a("blockId", aji.b(this.a));
/* 167 */     paramdh.a("blockData", this.i);
/* 168 */     paramdh.a("facing", this.j);
/* 169 */     paramdh.a("progress", this.n);
/* 170 */     paramdh.a("extending", this.k);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */