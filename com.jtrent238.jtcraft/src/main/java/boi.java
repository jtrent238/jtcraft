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
/*     */ 
/*     */ public class boi
/*     */   extends bno
/*     */ {
/*  16 */   private static final bqx g = new bqx("textures/entity/minecart.png");
/*  17 */   protected bhr a = new bhq();
/*     */   protected final blm f;
/*     */   
/*     */   public boi() {
/*  21 */     this.d = 0.5F;
/*  22 */     this.f = new blm();
/*     */   }
/*     */   
/*     */   public void a(xl paramxl, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  27 */     GL11.glPushMatrix();
/*     */     
/*  29 */     b(paramxl);
/*     */     
/*  31 */     long l = paramxl.y() * 493286711L;
/*  32 */     l = l * l * 4392167121L + l * 98761L;
/*     */     
/*  34 */     float f1 = (((float)(l >> 16 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*  35 */     float f2 = (((float)(l >> 20 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*  36 */     float f3 = (((float)(l >> 24 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*     */     
/*  38 */     GL11.glTranslatef(f1, f2, f3);
/*     */     
/*  40 */     double d1 = paramxl.S + (paramxl.s - paramxl.S) * paramFloat2;
/*  41 */     double d2 = paramxl.T + (paramxl.t - paramxl.T) * paramFloat2;
/*  42 */     double d3 = paramxl.U + (paramxl.u - paramxl.U) * paramFloat2;
/*     */     
/*  44 */     double d4 = 0.30000001192092896D;
/*     */     
/*  46 */     azw localazw1 = paramxl.a(d1, d2, d3);
/*     */     
/*  48 */     float f4 = paramxl.B + (paramxl.z - paramxl.B) * paramFloat2;
/*     */     
/*  50 */     if (localazw1 != null) {
/*  51 */       azw localazw2 = paramxl.a(d1, d2, d3, d4);
/*  52 */       azw localazw3 = paramxl.a(d1, d2, d3, -d4);
/*  53 */       if (localazw2 == null) localazw2 = localazw1;
/*  54 */       if (localazw3 == null) { localazw3 = localazw1;
/*     */       }
/*  56 */       paramDouble1 += localazw1.a - d1;
/*  57 */       paramDouble2 += (localazw2.b + localazw3.b) / 2.0D - d2;
/*  58 */       paramDouble3 += localazw1.c - d3;
/*     */       
/*  60 */       azw localazw4 = localazw3.c(-localazw2.a, -localazw2.b, -localazw2.c);
/*  61 */       if (localazw4.b() != 0.0D) {
/*  62 */         localazw4 = localazw4.a();
/*  63 */         paramFloat1 = (float)(Math.atan2(localazw4.c, localazw4.a) * 180.0D / 3.141592653589793D);
/*  64 */         f4 = (float)(Math.atan(localazw4.b) * 73.0D);
/*     */       }
/*     */     }
/*  67 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*     */     
/*  69 */     GL11.glRotatef(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
/*  70 */     GL11.glRotatef(-f4, 0.0F, 0.0F, 1.0F);
/*  71 */     float f5 = paramxl.k() - paramFloat2;
/*  72 */     float f6 = paramxl.j() - paramFloat2;
/*  73 */     if (f6 < 0.0F) f6 = 0.0F;
/*  74 */     if (f5 > 0.0F) {
/*  75 */       GL11.glRotatef(qh.a(f5) * f5 * f6 / 10.0F * paramxl.l(), 1.0F, 0.0F, 0.0F);
/*     */     }
/*  77 */     int i = paramxl.r();
/*  78 */     aji localaji = paramxl.n();
/*  79 */     int j = paramxl.p();
/*     */     
/*  81 */     if (localaji.b() != -1) {
/*  82 */       GL11.glPushMatrix();
/*     */       
/*  84 */       a(bpz.b);
/*  85 */       float f7 = 0.75F;
/*     */       
/*  87 */       GL11.glScalef(f7, f7, f7);
/*  88 */       GL11.glTranslatef(0.0F, i / 16.0F, 0.0F);
/*  89 */       a(paramxl, paramFloat2, localaji, j);
/*     */       
/*  91 */       GL11.glPopMatrix();
/*  92 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  93 */       b(paramxl);
/*     */     }
/*     */     
/*  96 */     GL11.glScalef(-1.0F, -1.0F, 1.0F);
/*  97 */     this.a.a(paramxl, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
/*  98 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   protected bqx a(xl paramxl)
/*     */   {
/* 103 */     return g;
/*     */   }
/*     */   
/*     */   protected void a(xl paramxl, float paramFloat, aji paramaji, int paramInt) {
/* 107 */     float f1 = paramxl.d(paramFloat);
/*     */     
/* 109 */     GL11.glPushMatrix();
/* 110 */     this.f.a(paramaji, paramInt, f1);
/* 111 */     GL11.glPopMatrix();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\boi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */