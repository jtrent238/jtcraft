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
/*     */ public class xq
/*     */   extends xl
/*     */ {
/*     */   private int c;
/*     */   public double a;
/*     */   public double b;
/*     */   
/*     */   public xq(ahb paramahb)
/*     */   {
/*  22 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public xq(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  26 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   
/*     */   public int m()
/*     */   {
/*  31 */     return 2;
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  36 */     super.c();
/*  37 */     this.af.a(16, new Byte((byte)0));
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  42 */     super.h();
/*     */     
/*  44 */     if (this.c > 0) {
/*  45 */       this.c -= 1;
/*     */     }
/*  47 */     if (this.c <= 0) {
/*  48 */       this.a = (this.b = 0.0D);
/*     */     }
/*  50 */     f(this.c > 0);
/*     */     
/*  52 */     if ((e()) && (this.Z.nextInt(4) == 0)) {
/*  53 */       this.o.a("largesmoke", this.s, this.t + 0.8D, this.u, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ro paramro)
/*     */   {
/*  59 */     super.a(paramro);
/*     */     
/*  61 */     if (!paramro.c()) {
/*  62 */       a(new add(ajn.al, 1), 0.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, aji paramaji, int paramInt4)
/*     */   {
/*  68 */     super.a(paramInt1, paramInt2, paramInt3, paramDouble1, paramDouble2, paramaji, paramInt4);
/*     */     
/*  70 */     double d = this.a * this.a + this.b * this.b;
/*  71 */     if ((d > 1.0E-4D) && (this.v * this.v + this.x * this.x > 0.001D)) {
/*  72 */       d = qh.a(d);
/*  73 */       this.a /= d;
/*  74 */       this.b /= d;
/*     */       
/*  76 */       if (this.a * this.v + this.b * this.x < 0.0D) {
/*  77 */         this.a = 0.0D;
/*  78 */         this.b = 0.0D;
/*     */       } else {
/*  80 */         this.a = this.v;
/*  81 */         this.b = this.x;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void i()
/*     */   {
/*  88 */     double d1 = this.a * this.a + this.b * this.b;
/*     */     
/*  90 */     if (d1 > 1.0E-4D) {
/*  91 */       d1 = qh.a(d1);
/*  92 */       this.a /= d1;
/*  93 */       this.b /= d1;
/*  94 */       double d2 = 0.05D;
/*  95 */       this.v *= 0.800000011920929D;
/*  96 */       this.w *= 0.0D;
/*  97 */       this.x *= 0.800000011920929D;
/*  98 */       this.v += this.a * d2;
/*  99 */       this.x += this.b * d2;
/*     */     } else {
/* 101 */       this.v *= 0.9800000190734863D;
/* 102 */       this.w *= 0.0D;
/* 103 */       this.x *= 0.9800000190734863D;
/*     */     }
/*     */     
/* 106 */     super.i();
/*     */   }
/*     */   
/*     */   public boolean c(yz paramyz)
/*     */   {
/* 111 */     add localadd = paramyz.bm.h();
/* 112 */     if ((localadd != null) && (localadd.b() == ade.h)) {
/* 113 */       if (!paramyz.bE.d) if (--localadd.b == 0) paramyz.bm.a(paramyz.bm.c, null);
/* 114 */       this.c += 3600;
/*     */     }
/*     */     
/* 117 */     this.a = (this.s - paramyz.s);
/* 118 */     this.b = (this.u - paramyz.u);
/*     */     
/* 120 */     return true;
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 125 */     super.b(paramdh);
/* 126 */     paramdh.a("PushX", this.a);
/* 127 */     paramdh.a("PushZ", this.b);
/* 128 */     paramdh.a("Fuel", (short)this.c);
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 133 */     super.a(paramdh);
/* 134 */     this.a = paramdh.i("PushX");
/* 135 */     this.b = paramdh.i("PushZ");
/* 136 */     this.c = paramdh.e("Fuel");
/*     */   }
/*     */   
/*     */   protected boolean e() {
/* 140 */     return (this.af.a(16) & 0x1) != 0;
/*     */   }
/*     */   
/*     */   protected void f(boolean paramBoolean) {
/* 144 */     if (paramBoolean) {
/* 145 */       this.af.b(16, Byte.valueOf((byte)(this.af.a(16) | 0x1)));
/*     */     } else {
/* 147 */       this.af.b(16, Byte.valueOf((byte)(this.af.a(16) & 0xFFFFFFFE)));
/*     */     }
/*     */   }
/*     */   
/*     */   public aji o()
/*     */   {
/* 153 */     return ajn.am;
/*     */   }
/*     */   
/*     */   public int q()
/*     */   {
/* 158 */     return 2;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */