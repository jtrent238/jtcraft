/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ public class st
/*     */   extends ss
/*     */ {
/*  19 */   private float e = 1.0F;
/*     */   
/*     */   public st(ahb paramahb) {
/*  22 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public st(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  26 */     super(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*  27 */     a(paramInt4);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  32 */     z().a(2, 5);
/*  33 */     z().a(3, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  38 */     if (aw()) { return false;
/*     */     }
/*  40 */     if (j() != null) {
/*  41 */       if (!this.o.E) {
/*  42 */         b(paramro.j(), false);
/*  43 */         a(null);
/*     */       }
/*  45 */       return true;
/*     */     }
/*  47 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */ 
/*     */   public int f()
/*     */   {
/*  53 */     return 9;
/*     */   }
/*     */   
/*     */   public int i()
/*     */   {
/*  58 */     return 9;
/*     */   }
/*     */   
/*     */   public boolean a(double paramDouble)
/*     */   {
/*  63 */     double d = 16.0D;
/*  64 */     d *= 64.0D * this.j;
/*  65 */     return paramDouble < d * d;
/*     */   }
/*     */   
/*     */   public void b(sa paramsa)
/*     */   {
/*  70 */     b(paramsa, true);
/*     */   }
/*     */   
/*     */   public void b(sa paramsa, boolean paramBoolean) {
/*  74 */     add localadd = j();
/*     */     
/*  76 */     if ((paramsa instanceof yz)) {
/*  77 */       yz localyz = (yz)paramsa;
/*     */       
/*  79 */       if (localyz.bE.d) {
/*  80 */         b(localadd);
/*  81 */         return;
/*     */       }
/*     */     }
/*     */     
/*  85 */     if (paramBoolean) a(new add(ade.bD), 0.0F);
/*  86 */     if ((localadd != null) && (this.Z.nextFloat() < this.e)) {
/*  87 */       localadd = localadd.m();
/*  88 */       b(localadd);
/*  89 */       a(localadd, 0.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(add paramadd) {
/*  94 */     if (paramadd == null) return;
/*  95 */     if (paramadd.b() == ade.aY) {
/*  96 */       ayi localayi = ((adh)paramadd.b()).a(paramadd, this.o);
/*  97 */       localayi.g.remove("frame-" + y());
/*     */     }
/*  99 */     paramadd.a(null);
/*     */   }
/*     */   
/*     */   public add j() {
/* 103 */     return z().f(2);
/*     */   }
/*     */   
/*     */   public void a(add paramadd) {
/* 107 */     if (paramadd != null) {
/* 108 */       paramadd = paramadd.m();
/* 109 */       paramadd.b = 1;
/* 110 */       paramadd.a(this);
/*     */     }
/* 112 */     z().b(2, paramadd);
/* 113 */     z().h(2);
/*     */   }
/*     */   
/*     */   public int k() {
/* 117 */     return z().a(3);
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 121 */     z().b(3, Byte.valueOf((byte)(paramInt % 4)));
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 126 */     if (j() != null) {
/* 127 */       paramdh.a("Item", j().b(new dh()));
/* 128 */       paramdh.a("ItemRotation", (byte)k());
/* 129 */       paramdh.a("ItemDropChance", this.e);
/*     */     }
/* 131 */     super.b(paramdh);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 136 */     dh localdh = paramdh.m("Item");
/* 137 */     if ((localdh != null) && (!localdh.d())) {
/* 138 */       a(add.a(localdh));
/* 139 */       c(paramdh.d("ItemRotation"));
/*     */       
/* 141 */       if (paramdh.b("ItemDropChance", 99)) this.e = paramdh.h("ItemDropChance");
/*     */     }
/* 143 */     super.a(paramdh);
/*     */   }
/*     */   
/*     */   public boolean c(yz paramyz)
/*     */   {
/* 148 */     if (j() == null) {
/* 149 */       add localadd = paramyz.be();
/*     */       
/* 151 */       if ((localadd != null) && 
/* 152 */         (!this.o.E)) {
/* 153 */         a(localadd);
/*     */         
/* 155 */         if (!paramyz.bE.d) {
/* 156 */           if (--localadd.b <= 0) {
/* 157 */             paramyz.bm.a(paramyz.bm.c, null);
/*     */           }
/*     */           
/*     */         }
/*     */       }
/*     */     }
/* 163 */     else if (!this.o.E) {
/* 164 */       c(k() + 1);
/*     */     }
/*     */     
/*     */ 
/* 168 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\st.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */