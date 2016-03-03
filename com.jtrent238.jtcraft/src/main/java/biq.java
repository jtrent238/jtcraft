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
/*     */ public class biq
/*     */   extends bhr
/*     */ {
/*     */   private bix a;
/*     */   private bix b;
/*     */   private bix c;
/*     */   private bix d;
/*     */   private bix e;
/*     */   private bix f;
/*     */   private bix g;
/*     */   private bix h;
/*     */   private bix i;
/*     */   private bix j;
/*     */   private bix k;
/*     */   private bix l;
/*     */   private float m;
/*     */   
/*     */   public biq(float paramFloat)
/*     */   {
/*  30 */     this.t = 256;
/*  31 */     this.u = 256;
/*     */     
/*  33 */     a("body.body", 0, 0);
/*  34 */     a("wing.skin", -56, 88);
/*  35 */     a("wingtip.skin", -56, 144);
/*  36 */     a("rearleg.main", 0, 0);
/*  37 */     a("rearfoot.main", 112, 0);
/*  38 */     a("rearlegtip.main", 196, 0);
/*  39 */     a("head.upperhead", 112, 30);
/*  40 */     a("wing.bone", 112, 88);
/*  41 */     a("head.upperlip", 176, 44);
/*  42 */     a("jaw.jaw", 176, 65);
/*  43 */     a("frontleg.main", 112, 104);
/*  44 */     a("wingtip.bone", 112, 136);
/*  45 */     a("frontfoot.main", 144, 104);
/*  46 */     a("neck.box", 192, 104);
/*  47 */     a("frontlegtip.main", 226, 138);
/*  48 */     a("body.scale", 220, 53);
/*  49 */     a("head.scale", 0, 0);
/*  50 */     a("neck.scale", 48, 0);
/*  51 */     a("head.nostril", 112, 0);
/*     */     
/*  53 */     float f1 = -16.0F;
/*  54 */     this.a = new bix(this, "head");
/*  55 */     this.a.a("upperlip", -6.0F, -1.0F, -8.0F + f1, 12, 5, 16);
/*  56 */     this.a.a("upperhead", -8.0F, -8.0F, 6.0F + f1, 16, 16, 16);
/*  57 */     this.a.i = true;
/*  58 */     this.a.a("scale", -5.0F, -12.0F, 12.0F + f1, 2, 4, 6);
/*  59 */     this.a.a("nostril", -5.0F, -3.0F, -6.0F + f1, 2, 2, 4);
/*  60 */     this.a.i = false;
/*  61 */     this.a.a("scale", 3.0F, -12.0F, 12.0F + f1, 2, 4, 6);
/*  62 */     this.a.a("nostril", 3.0F, -3.0F, -6.0F + f1, 2, 2, 4);
/*     */     
/*  64 */     this.c = new bix(this, "jaw");
/*  65 */     this.c.a(0.0F, 4.0F, 8.0F + f1);
/*  66 */     this.c.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
/*  67 */     this.a.a(this.c);
/*     */     
/*  69 */     this.b = new bix(this, "neck");
/*  70 */     this.b.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
/*  71 */     this.b.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
/*     */     
/*  73 */     this.d = new bix(this, "body");
/*  74 */     this.d.a(0.0F, 4.0F, 8.0F);
/*  75 */     this.d.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
/*  76 */     this.d.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
/*  77 */     this.d.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
/*  78 */     this.d.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
/*     */     
/*  80 */     this.k = new bix(this, "wing");
/*  81 */     this.k.a(-12.0F, 5.0F, 2.0F);
/*  82 */     this.k.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
/*  83 */     this.k.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
/*  84 */     this.l = new bix(this, "wingtip");
/*  85 */     this.l.a(-56.0F, 0.0F, 0.0F);
/*  86 */     this.l.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
/*  87 */     this.l.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
/*  88 */     this.k.a(this.l);
/*     */     
/*  90 */     this.f = new bix(this, "frontleg");
/*  91 */     this.f.a(-12.0F, 20.0F, 2.0F);
/*  92 */     this.f.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
/*  93 */     this.h = new bix(this, "frontlegtip");
/*  94 */     this.h.a(0.0F, 20.0F, -1.0F);
/*  95 */     this.h.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
/*  96 */     this.f.a(this.h);
/*  97 */     this.j = new bix(this, "frontfoot");
/*  98 */     this.j.a(0.0F, 23.0F, 0.0F);
/*  99 */     this.j.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
/* 100 */     this.h.a(this.j);
/*     */     
/* 102 */     this.e = new bix(this, "rearleg");
/* 103 */     this.e.a(-16.0F, 16.0F, 42.0F);
/* 104 */     this.e.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
/* 105 */     this.g = new bix(this, "rearlegtip");
/* 106 */     this.g.a(0.0F, 32.0F, -4.0F);
/* 107 */     this.g.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
/* 108 */     this.e.a(this.g);
/* 109 */     this.i = new bix(this, "rearfoot");
/* 110 */     this.i.a(0.0F, 31.0F, 4.0F);
/* 111 */     this.i.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
/* 112 */     this.g.a(this.i);
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 117 */     this.m = paramFloat3;
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/* 122 */     GL11.glPushMatrix();
/* 123 */     xa localxa = (xa)paramsa;
/* 124 */     float f1 = localxa.bx + (localxa.by - localxa.bx) * this.m;
/* 125 */     this.c.f = ((float)(Math.sin(f1 * 3.1415927F * 2.0F) + 1.0D) * 0.2F);
/*     */     
/* 127 */     float f2 = (float)(Math.sin(f1 * 3.1415927F * 2.0F - 1.0F) + 1.0D);
/* 128 */     f2 = (f2 * f2 * 1.0F + f2 * 2.0F) * 0.05F;
/*     */     
/* 130 */     GL11.glTranslatef(0.0F, f2 - 2.0F, -3.0F);
/* 131 */     GL11.glRotatef(f2 * 2.0F, 1.0F, 0.0F, 0.0F);
/*     */     
/* 133 */     float f3 = -30.0F;
/*     */     
/* 135 */     float f5 = 0.0F;
/*     */     
/* 137 */     float f6 = 1.5F;
/*     */     
/* 139 */     double[] arrayOfDouble1 = localxa.b(6, this.m);
/*     */     
/* 141 */     float f7 = a(localxa.b(5, this.m)[0] - localxa.b(10, this.m)[0]);
/* 142 */     float f8 = a(localxa.b(5, this.m)[0] + f7 / 2.0F);
/*     */     
/* 144 */     f3 += 2.0F;
/*     */     
/* 146 */     float f9 = f1 * 3.1415927F * 2.0F;
/* 147 */     f3 = 20.0F;
/* 148 */     float f4 = -12.0F;
/* 149 */     float f11; for (int n = 0; n < 5; n++) {
/* 150 */       double[] arrayOfDouble3 = localxa.b(5 - n, this.m);
/* 151 */       f11 = (float)Math.cos(n * 0.45F + f9) * 0.15F;
/* 152 */       this.b.g = (a(arrayOfDouble3[0] - arrayOfDouble1[0]) * 3.1415927F / 180.0F * f6);
/* 153 */       this.b.f = (f11 + (float)(arrayOfDouble3[1] - arrayOfDouble1[1]) * 3.1415927F / 180.0F * f6 * 5.0F);
/* 154 */       this.b.h = (-a(arrayOfDouble3[0] - f8) * 3.1415927F / 180.0F * f6);
/*     */       
/* 156 */       this.b.d = f3;
/* 157 */       this.b.e = f4;
/* 158 */       this.b.c = f5;
/* 159 */       f3 = (float)(f3 + Math.sin(this.b.f) * 10.0D);
/* 160 */       f4 = (float)(f4 - Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0D);
/* 161 */       f5 = (float)(f5 - Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0D);
/* 162 */       this.b.a(paramFloat6);
/*     */     }
/*     */     
/* 165 */     this.a.d = f3;
/* 166 */     this.a.e = f4;
/* 167 */     this.a.c = f5;
/* 168 */     double[] arrayOfDouble2 = localxa.b(0, this.m);
/* 169 */     this.a.g = (a(arrayOfDouble2[0] - arrayOfDouble1[0]) * 3.1415927F / 180.0F * 1.0F);
/* 170 */     this.a.h = (-a(arrayOfDouble2[0] - f8) * 3.1415927F / 180.0F * 1.0F);
/* 171 */     this.a.a(paramFloat6);
/* 172 */     GL11.glPushMatrix();
/* 173 */     GL11.glTranslatef(0.0F, 1.0F, 0.0F);
/* 174 */     GL11.glRotatef(-f7 * f6 * 1.0F, 0.0F, 0.0F, 1.0F);
/* 175 */     GL11.glTranslatef(0.0F, -1.0F, 0.0F);
/* 176 */     this.d.h = 0.0F;
/* 177 */     this.d.a(paramFloat6);
/*     */     
/* 179 */     for (int i1 = 0; i1 < 2; i1++) {
/* 180 */       GL11.glEnable(2884);
/* 181 */       f11 = f1 * 3.1415927F * 2.0F;
/* 182 */       this.k.f = (0.125F - (float)Math.cos(f11) * 0.2F);
/* 183 */       this.k.g = 0.25F;
/* 184 */       this.k.h = ((float)(Math.sin(f11) + 0.125D) * 0.8F);
/* 185 */       this.l.h = (-(float)(Math.sin(f11 + 2.0F) + 0.5D) * 0.75F);
/*     */       
/* 187 */       this.e.f = (1.0F + f2 * 0.1F);
/* 188 */       this.g.f = (0.5F + f2 * 0.1F);
/* 189 */       this.i.f = (0.75F + f2 * 0.1F);
/*     */       
/* 191 */       this.f.f = (1.3F + f2 * 0.1F);
/* 192 */       this.h.f = (-0.5F - f2 * 0.1F);
/* 193 */       this.j.f = (0.75F + f2 * 0.1F);
/* 194 */       this.k.a(paramFloat6);
/* 195 */       this.f.a(paramFloat6);
/* 196 */       this.e.a(paramFloat6);
/* 197 */       GL11.glScalef(-1.0F, 1.0F, 1.0F);
/*     */       
/* 199 */       if (i1 == 0) {
/* 200 */         GL11.glCullFace(1028);
/*     */       }
/*     */     }
/* 203 */     GL11.glPopMatrix();
/* 204 */     GL11.glCullFace(1029);
/* 205 */     GL11.glDisable(2884);
/*     */     
/* 207 */     float f10 = -(float)Math.sin(f1 * 3.1415927F * 2.0F) * 0.0F;
/* 208 */     f9 = f1 * 3.1415927F * 2.0F;
/* 209 */     f3 = 10.0F;
/* 210 */     f4 = 60.0F;
/* 211 */     f5 = 0.0F;
/* 212 */     arrayOfDouble1 = localxa.b(11, this.m);
/* 213 */     for (int i2 = 0; i2 < 12; i2++) {
/* 214 */       arrayOfDouble2 = localxa.b(12 + i2, this.m);
/* 215 */       f10 = (float)(f10 + Math.sin(i2 * 0.45F + f9) * 0.05000000074505806D);
/* 216 */       this.b.g = ((a(arrayOfDouble2[0] - arrayOfDouble1[0]) * f6 + 180.0F) * 3.1415927F / 180.0F);
/* 217 */       this.b.f = (f10 + (float)(arrayOfDouble2[1] - arrayOfDouble1[1]) * 3.1415927F / 180.0F * f6 * 5.0F);
/* 218 */       this.b.h = (a(arrayOfDouble2[0] - f8) * 3.1415927F / 180.0F * f6);
/* 219 */       this.b.d = f3;
/* 220 */       this.b.e = f4;
/* 221 */       this.b.c = f5;
/* 222 */       f3 = (float)(f3 + Math.sin(this.b.f) * 10.0D);
/* 223 */       f4 = (float)(f4 - Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0D);
/* 224 */       f5 = (float)(f5 - Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0D);
/* 225 */       this.b.a(paramFloat6);
/*     */     }
/* 227 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   private float a(double paramDouble) {
/* 231 */     while (paramDouble >= 180.0D)
/* 232 */       paramDouble -= 360.0D;
/* 233 */     while (paramDouble < -180.0D)
/* 234 */       paramDouble += 360.0D;
/* 235 */     return (float)paramDouble;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\biq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */