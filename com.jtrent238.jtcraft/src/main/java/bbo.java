/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bbo
/*     */   implements qk
/*     */ {
/*  15 */   private String a = "";
/*     */   private bao b;
/*  17 */   private String c = "";
/*  18 */   private long d = bao.K();
/*     */   private boolean e;
/*     */   private bca f;
/*     */   private bmg g;
/*     */   
/*     */   public bbo(bao parambao) {
/*  24 */     this.b = parambao;
/*  25 */     this.f = new bca(parambao, parambao.d, parambao.e);
/*  26 */     this.g = new bmg(parambao.d, parambao.e, false);
/*  27 */     this.g.a(9728);
/*     */   }
/*     */   
/*     */   public void b(String paramString)
/*     */   {
/*  32 */     this.e = false;
/*  33 */     d(paramString);
/*     */   }
/*     */   
/*     */   public void a(String paramString)
/*     */   {
/*  38 */     this.e = true;
/*  39 */     d(paramString);
/*     */   }
/*     */   
/*     */   public void d(String paramString) {
/*  43 */     this.c = paramString;
/*  44 */     if (!this.b.A) {
/*  45 */       if (this.e) return;
/*  46 */       throw new bbq();
/*     */     }
/*     */     
/*  49 */     GL11.glClear(256);
/*  50 */     GL11.glMatrixMode(5889);
/*  51 */     GL11.glLoadIdentity();
/*  52 */     if (buu.g()) {
/*  53 */       int i = this.f.e();
/*  54 */       GL11.glOrtho(0.0D, this.f.a() * i, this.f.b() * i, 0.0D, 100.0D, 300.0D);
/*     */     } else {
/*  56 */       bca localbca = new bca(this.b, this.b.d, this.b.e);
/*  57 */       GL11.glOrtho(0.0D, localbca.c(), localbca.d(), 0.0D, 100.0D, 300.0D);
/*     */     }
/*  59 */     GL11.glMatrixMode(5888);
/*  60 */     GL11.glLoadIdentity();
/*  61 */     GL11.glTranslatef(0.0F, 0.0F, -200.0F);
/*     */   }
/*     */   
/*     */   public void c(String paramString)
/*     */   {
/*  66 */     if (!this.b.A) {
/*  67 */       if (this.e) return;
/*  68 */       throw new bbq();
/*     */     }
/*     */     
/*  71 */     this.d = 0L;
/*  72 */     this.a = paramString;
/*  73 */     a(-1);
/*  74 */     this.d = 0L;
/*     */   }
/*     */   
/*     */   public void a(int paramInt)
/*     */   {
/*  79 */     if (!this.b.A) {
/*  80 */       if (this.e) return;
/*  81 */       throw new bbq();
/*     */     }
/*     */     
/*  84 */     long l = bao.K();
/*  85 */     if (l - this.d < 100L) return;
/*  86 */     this.d = l;
/*     */     
/*  88 */     bca localbca = new bca(this.b, this.b.d, this.b.e);
/*  89 */     int i = localbca.e();
/*  90 */     int j = localbca.a();
/*  91 */     int k = localbca.b();
/*     */     
/*  93 */     if (buu.g()) {
/*  94 */       this.g.f();
/*     */     } else {
/*  96 */       GL11.glClear(256);
/*     */     }
/*  98 */     this.g.a(false);
/*  99 */     GL11.glMatrixMode(5889);
/* 100 */     GL11.glLoadIdentity();
/* 101 */     GL11.glOrtho(0.0D, localbca.c(), localbca.d(), 0.0D, 100.0D, 300.0D);
/* 102 */     GL11.glMatrixMode(5888);
/* 103 */     GL11.glLoadIdentity();
/* 104 */     GL11.glTranslatef(0.0F, 0.0F, -200.0F);
/*     */     
/* 106 */     if (!buu.g()) {
/* 107 */       GL11.glClear(16640);
/*     */     }
/*     */     
/* 110 */     bmh localbmh = bmh.a;
/* 111 */     this.b.P().a(bbw.b);
/* 112 */     float f1 = 32.0F;
/* 113 */     localbmh.b();
/* 114 */     localbmh.c(4210752);
/* 115 */     localbmh.a(0.0D, k, 0.0D, 0.0D, k / f1);
/* 116 */     localbmh.a(j, k, 0.0D, j / f1, k / f1);
/* 117 */     localbmh.a(j, 0.0D, 0.0D, j / f1, 0.0D);
/* 118 */     localbmh.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 119 */     localbmh.a();
/*     */     
/* 121 */     if (paramInt >= 0) {
/* 122 */       int m = 100;
/* 123 */       int n = 2;
/* 124 */       int i1 = j / 2 - m / 2;
/* 125 */       int i2 = k / 2 + 16;
/*     */       
/* 127 */       GL11.glDisable(3553);
/* 128 */       localbmh.b();
/* 129 */       localbmh.c(8421504);
/* 130 */       localbmh.a(i1, i2, 0.0D);
/* 131 */       localbmh.a(i1, i2 + n, 0.0D);
/* 132 */       localbmh.a(i1 + m, i2 + n, 0.0D);
/* 133 */       localbmh.a(i1 + m, i2, 0.0D);
/*     */       
/* 135 */       localbmh.c(8454016);
/* 136 */       localbmh.a(i1, i2, 0.0D);
/* 137 */       localbmh.a(i1, i2 + n, 0.0D);
/* 138 */       localbmh.a(i1 + paramInt, i2 + n, 0.0D);
/* 139 */       localbmh.a(i1 + paramInt, i2, 0.0D);
/* 140 */       localbmh.a();
/* 141 */       GL11.glEnable(3553);
/*     */     }
/*     */     
/* 144 */     GL11.glEnable(3042);
/* 145 */     buu.c(770, 771, 1, 0);
/* 146 */     this.b.l.a(this.c, (j - this.b.l.a(this.c)) / 2, k / 2 - 4 - 16, 16777215);
/* 147 */     this.b.l.a(this.a, (j - this.b.l.a(this.a)) / 2, k / 2 - 4 + 8, 16777215);
/* 148 */     this.g.e();
/* 149 */     if (buu.g()) {
/* 150 */       this.g.c(j * i, k * i);
/*     */     }
/* 152 */     this.b.g();
/*     */     try
/*     */     {
/* 155 */       Thread.yield();
/*     */     }
/*     */     catch (Exception localException) {}
/*     */   }
/*     */   
/*     */   public void a() {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */