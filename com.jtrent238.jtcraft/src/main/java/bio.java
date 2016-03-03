/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bio
/*     */   extends bhr
/*     */ {
/*     */   public bix a;
/*     */   public bix b;
/*     */   public bix c;
/*     */   public bix d;
/*     */   public bix e;
/*     */   public bix f;
/*     */   bix g;
/*     */   bix h;
/*     */   
/*     */   public bio()
/*     */   {
/*  22 */     float f1 = 0.0F;
/*     */     
/*  24 */     float f2 = 13.5F;
/*     */     
/*  26 */     this.a = new bix(this, 0, 0);
/*  27 */     this.a.a(-3.0F, -3.0F, -2.0F, 6, 6, 4, f1);
/*  28 */     this.a.a(-1.0F, f2, -7.0F);
/*     */     
/*  30 */     this.b = new bix(this, 18, 14);
/*  31 */     this.b.a(-4.0F, -2.0F, -3.0F, 6, 9, 6, f1);
/*  32 */     this.b.a(0.0F, 14.0F, 2.0F);
/*     */     
/*  34 */     this.h = new bix(this, 21, 0);
/*  35 */     this.h.a(-4.0F, -3.0F, -3.0F, 8, 6, 7, f1);
/*  36 */     this.h.a(-1.0F, 14.0F, 2.0F);
/*     */     
/*  38 */     this.c = new bix(this, 0, 18);
/*  39 */     this.c.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  40 */     this.c.a(-2.5F, 16.0F, 7.0F);
/*     */     
/*  42 */     this.d = new bix(this, 0, 18);
/*  43 */     this.d.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  44 */     this.d.a(0.5F, 16.0F, 7.0F);
/*     */     
/*  46 */     this.e = new bix(this, 0, 18);
/*  47 */     this.e.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  48 */     this.e.a(-2.5F, 16.0F, -4.0F);
/*     */     
/*  50 */     this.f = new bix(this, 0, 18);
/*  51 */     this.f.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  52 */     this.f.a(0.5F, 16.0F, -4.0F);
/*     */     
/*  54 */     this.g = new bix(this, 9, 18);
/*  55 */     this.g.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  56 */     this.g.a(-1.0F, 12.0F, 8.0F);
/*     */     
/*  58 */     this.a.a(16, 14).a(-3.0F, -5.0F, 0.0F, 2, 2, 1, f1);
/*  59 */     this.a.a(16, 14).a(1.0F, -5.0F, 0.0F, 2, 2, 1, f1);
/*  60 */     this.a.a(0, 10).a(-1.5F, 0.0F, -5.0F, 3, 3, 4, f1);
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/*  65 */     super.a(paramsa, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  66 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*     */     
/*  68 */     if (this.s) {
/*  69 */       float f1 = 2.0F;
/*  70 */       GL11.glPushMatrix();
/*  71 */       GL11.glTranslatef(0.0F, 5.0F * paramFloat6, 2.0F * paramFloat6);
/*  72 */       this.a.b(paramFloat6);
/*  73 */       GL11.glPopMatrix();
/*  74 */       GL11.glPushMatrix();
/*  75 */       GL11.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/*  76 */       GL11.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/*  77 */       this.b.a(paramFloat6);
/*  78 */       this.c.a(paramFloat6);
/*  79 */       this.d.a(paramFloat6);
/*  80 */       this.e.a(paramFloat6);
/*  81 */       this.f.a(paramFloat6);
/*     */       
/*  83 */       this.g.b(paramFloat6);
/*  84 */       this.h.a(paramFloat6);
/*  85 */       GL11.glPopMatrix();
/*     */     } else {
/*  87 */       this.a.b(paramFloat6);
/*  88 */       this.b.a(paramFloat6);
/*  89 */       this.c.a(paramFloat6);
/*  90 */       this.d.a(paramFloat6);
/*  91 */       this.e.a(paramFloat6);
/*  92 */       this.f.a(paramFloat6);
/*     */       
/*  94 */       this.g.b(paramFloat6);
/*  95 */       this.h.a(paramFloat6);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 101 */     wv localwv = (wv)paramsv;
/*     */     
/* 103 */     if (localwv.ci()) {
/* 104 */       this.g.g = 0.0F;
/*     */     } else {
/* 106 */       this.g.g = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/*     */     }
/*     */     
/* 109 */     if (localwv.ca()) {
/* 110 */       this.h.a(-1.0F, 16.0F, -3.0F);
/* 111 */       this.h.f = 1.2566371F;
/* 112 */       this.h.g = 0.0F;
/*     */       
/* 114 */       this.b.a(0.0F, 18.0F, 0.0F);
/* 115 */       this.b.f = 0.7853982F;
/*     */       
/* 117 */       this.g.a(-1.0F, 21.0F, 6.0F);
/*     */       
/* 119 */       this.c.a(-2.5F, 22.0F, 2.0F);
/* 120 */       this.c.f = 4.712389F;
/* 121 */       this.d.a(0.5F, 22.0F, 2.0F);
/* 122 */       this.d.f = 4.712389F;
/*     */       
/* 124 */       this.e.f = 5.811947F;
/* 125 */       this.e.a(-2.49F, 17.0F, -4.0F);
/* 126 */       this.f.f = 5.811947F;
/* 127 */       this.f.a(0.51F, 17.0F, -4.0F);
/*     */     } else {
/* 129 */       this.b.a(0.0F, 14.0F, 2.0F);
/* 130 */       this.b.f = 1.5707964F;
/*     */       
/* 132 */       this.h.a(-1.0F, 14.0F, -3.0F);
/* 133 */       this.h.f = this.b.f;
/*     */       
/* 135 */       this.g.a(-1.0F, 12.0F, 8.0F);
/*     */       
/* 137 */       this.c.a(-2.5F, 16.0F, 7.0F);
/* 138 */       this.d.a(0.5F, 16.0F, 7.0F);
/* 139 */       this.e.a(-2.5F, 16.0F, -4.0F);
/* 140 */       this.f.a(0.5F, 16.0F, -4.0F);
/*     */       
/* 142 */       this.c.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 143 */       this.d.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2);
/* 144 */       this.e.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2);
/* 145 */       this.f.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/*     */     }
/*     */     
/* 148 */     this.a.h = (localwv.q(paramFloat3) + localwv.g(paramFloat3, 0.0F));
/*     */     
/* 150 */     this.h.h = localwv.g(paramFloat3, -0.08F);
/* 151 */     this.b.h = localwv.g(paramFloat3, -0.16F);
/* 152 */     this.g.h = localwv.g(paramFloat3, -0.2F);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*     */   {
/* 157 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/* 158 */     this.a.f = (paramFloat5 / 57.295776F);
/* 159 */     this.a.g = (paramFloat4 / 57.295776F);
/*     */     
/* 161 */     this.g.f = paramFloat3;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */