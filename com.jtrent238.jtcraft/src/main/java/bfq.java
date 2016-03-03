/*     */ import java.util.Random;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.util.glu.Project;
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
/*     */ public class bfq
/*     */   extends bex
/*     */ {
/*  22 */   private static final bqx C = new bqx("textures/gui/container/enchanting_table.png");
/*  23 */   private static final bqx D = new bqx("textures/entity/enchanting_table_book.png");
/*  24 */   private static final bhf E = new bhf();
/*  25 */   private Random F = new Random();
/*     */   
/*     */   private aag G;
/*     */   
/*     */   public int u;
/*     */   public float v;
/*     */   public float w;
/*     */   public float x;
/*     */   
/*     */   public bfq(yx paramyx, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, String paramString)
/*     */   {
/*  36 */     super(new aag(paramyx, paramahb, paramInt1, paramInt2, paramInt3));
/*  37 */     this.G = ((aag)this.h);
/*  38 */     this.H = paramString;
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2)
/*     */   {
/*  43 */     this.q.b(this.H == null ? brp.a("container.enchant", new Object[0]) : this.H, 12, 5, 4210752);
/*  44 */     this.q.b(brp.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  49 */     super.e();
/*  50 */     a();
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  55 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */     
/*  57 */     int i = (this.l - this.f) / 2;
/*  58 */     int j = (this.m - this.g) / 2;
/*  59 */     for (int k = 0; k < 3; k++) {
/*  60 */       int m = paramInt1 - (i + 60);
/*  61 */       int n = paramInt2 - (j + 14 + 19 * k);
/*  62 */       if ((m >= 0) && (n >= 0) && (m < 108) && (n < 19) && 
/*  63 */         (this.G.a(this.k.h, k)))
/*  64 */         this.k.c.a(this.G.d, k);
/*     */     } }
/*     */   
/*     */   public float y;
/*     */   public float z;
/*     */   public float A;
/*     */   add B;
/*     */   private String H;
/*  72 */   protected void a(float paramFloat, int paramInt1, int paramInt2) { GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  73 */     this.k.P().a(C);
/*  74 */     int i = (this.l - this.f) / 2;
/*  75 */     int j = (this.m - this.g) / 2;
/*  76 */     b(i, j, 0, 0, this.f, this.g);
/*     */     
/*  78 */     GL11.glPushMatrix();
/*  79 */     GL11.glMatrixMode(5889);
/*  80 */     GL11.glPushMatrix();
/*  81 */     GL11.glLoadIdentity();
/*  82 */     bca localbca = new bca(this.k, this.k.d, this.k.e);
/*     */     
/*  84 */     GL11.glViewport((localbca.a() - 320) / 2 * localbca.e(), (localbca.b() - 240) / 2 * localbca.e(), 320 * localbca.e(), 240 * localbca.e());
/*  85 */     GL11.glTranslatef(-0.34F, 0.23F, 0.0F);
/*     */     
/*  87 */     Project.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
/*     */     
/*  89 */     float f1 = 1.0F;
/*  90 */     GL11.glMatrixMode(5888);
/*  91 */     GL11.glLoadIdentity();
/*  92 */     bam.b();
/*  93 */     GL11.glTranslatef(0.0F, 3.3F, -16.0F);
/*  94 */     GL11.glScalef(f1, f1, f1);
/*  95 */     float f2 = 5.0F;
/*  96 */     GL11.glScalef(f2, f2, f2);
/*  97 */     GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*     */     
/*  99 */     this.k.P().a(D);
/* 100 */     GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/* 101 */     float f3 = this.A + (this.z - this.A) * paramFloat;
/* 102 */     GL11.glTranslatef((1.0F - f3) * 0.2F, (1.0F - f3) * 0.1F, (1.0F - f3) * 0.25F);
/* 103 */     GL11.glRotatef(-(1.0F - f3) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
/* 104 */     GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/*     */     
/* 106 */     float f4 = this.w + (this.v - this.w) * paramFloat + 0.25F;
/* 107 */     float f5 = this.w + (this.v - this.w) * paramFloat + 0.75F;
/* 108 */     f4 = (f4 - qh.b(f4)) * 1.6F - 0.3F;
/* 109 */     f5 = (f5 - qh.b(f5)) * 1.6F - 0.3F;
/*     */     
/* 111 */     if (f4 < 0.0F) f4 = 0.0F;
/* 112 */     if (f5 < 0.0F) f5 = 0.0F;
/* 113 */     if (f4 > 1.0F) f4 = 1.0F;
/* 114 */     if (f5 > 1.0F) { f5 = 1.0F;
/*     */     }
/* 116 */     GL11.glEnable(32826);
/*     */     
/* 118 */     E.a(null, 0.0F, f4, f5, f3, 0.0F, 0.0625F);
/*     */     
/* 120 */     GL11.glDisable(32826);
/* 121 */     bam.a();
/* 122 */     GL11.glMatrixMode(5889);
/* 123 */     GL11.glViewport(0, 0, this.k.d, this.k.e);
/* 124 */     GL11.glPopMatrix();
/* 125 */     GL11.glMatrixMode(5888);
/* 126 */     GL11.glPopMatrix();
/*     */     
/* 128 */     bam.a();
/* 129 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 131 */     bfp.a.a(this.G.f);
/*     */     
/* 133 */     for (int k = 0; k < 3; k++) {
/* 134 */       String str1 = bfp.a.a();
/* 135 */       this.e = 0.0F;
/* 136 */       this.k.P().a(C);
/* 137 */       int m = this.G.g[k];
/* 138 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 139 */       if (m == 0) {
/* 140 */         b(i + 60, j + 14 + 19 * k, 0, 185, 108, 19);
/*     */       }
/*     */       else {
/* 143 */         String str2 = "" + m;
/* 144 */         bbu localbbu = this.k.m;
/* 145 */         int n = 6839882;
/* 146 */         if ((this.k.h.bF < m) && (!this.k.h.bE.d)) {
/* 147 */           b(i + 60, j + 14 + 19 * k, 0, 185, 108, 19);
/* 148 */           localbbu.a(str1, i + 62, j + 16 + 19 * k, 104, (n & 0xFEFEFE) >> 1);
/* 149 */           localbbu = this.k.l;
/* 150 */           n = 4226832;
/* 151 */           localbbu.a(str2, i + 62 + 104 - localbbu.a(str2), j + 16 + 19 * k + 7, n);
/*     */         } else {
/* 153 */           int i1 = paramInt1 - (i + 60);
/* 154 */           int i2 = paramInt2 - (j + 14 + 19 * k);
/* 155 */           if ((i1 >= 0) && (i2 >= 0) && (i1 < 108) && (i2 < 19)) {
/* 156 */             b(i + 60, j + 14 + 19 * k, 0, 204, 108, 19);
/* 157 */             n = 16777088;
/*     */           } else {
/* 159 */             b(i + 60, j + 14 + 19 * k, 0, 166, 108, 19);
/*     */           }
/* 161 */           localbbu.a(str1, i + 62, j + 16 + 19 * k, 104, n);
/* 162 */           localbbu = this.k.l;
/* 163 */           n = 8453920;
/* 164 */           localbbu.a(str2, i + 62 + 104 - localbbu.a(str2), j + 16 + 19 * k + 7, n);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 170 */   public void a() { add localadd = this.h.a(0).d();
/*     */     
/* 172 */     if (!add.b(localadd, this.B)) {
/* 173 */       this.B = localadd;
/*     */       do {
/* 175 */         this.x += this.F.nextInt(4) - this.F.nextInt(4);
/* 176 */       } while ((this.v <= this.x + 1.0F) && (this.v >= this.x - 1.0F));
/*     */     }
/*     */     
/* 179 */     this.u += 1;
/* 180 */     this.w = this.v;
/* 181 */     this.A = this.z;
/*     */     
/* 183 */     int i = 0;
/* 184 */     for (int j = 0; j < 3; j++) {
/* 185 */       if (this.G.g[j] != 0) {
/* 186 */         i = 1;
/*     */       }
/*     */     }
/*     */     
/* 190 */     if (i != 0) this.z += 0.2F; else
/* 191 */       this.z -= 0.2F;
/* 192 */     if (this.z < 0.0F) this.z = 0.0F;
/* 193 */     if (this.z > 1.0F) { this.z = 1.0F;
/*     */     }
/* 195 */     float f1 = (this.x - this.v) * 0.4F;
/* 196 */     float f2 = 0.2F;
/* 197 */     if (f1 < -f2) f1 = -f2;
/* 198 */     if (f1 > f2) f1 = f2;
/* 199 */     this.y += (f1 - this.y) * 0.9F;
/*     */     
/* 201 */     this.v += this.y;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */