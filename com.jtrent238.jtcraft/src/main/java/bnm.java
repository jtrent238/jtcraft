/*     */ import java.util.Random;
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
/*     */ public class bnm
/*     */   extends bok
/*     */ {
/*  16 */   private static final bqx a = new bqx("textures/entity/enderman/enderman_eyes.png");
/*  17 */   private static final bqx f = new bqx("textures/entity/enderman/enderman.png");
/*     */   private bhk g;
/*  19 */   private Random h = new Random();
/*     */   
/*     */   public bnm() {
/*  22 */     super(new bhk(), 0.5F);
/*  23 */     this.g = ((bhk)this.i);
/*  24 */     a(this.g);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ya paramya, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  30 */     this.g.a = (paramya.cb().o() != awt.a);
/*  31 */     this.g.b = paramya.cd();
/*     */     
/*  33 */     if (paramya.cd()) {
/*  34 */       double d = 0.02D;
/*  35 */       paramDouble1 += this.h.nextGaussian() * d;
/*  36 */       paramDouble3 += this.h.nextGaussian() * d;
/*     */     }
/*     */     
/*  39 */     super.a(paramya, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*     */   }
/*     */   
/*     */   protected bqx a(ya paramya)
/*     */   {
/*  44 */     return f;
/*     */   }
/*     */   
/*     */   protected void a(ya paramya, float paramFloat)
/*     */   {
/*  49 */     super.c(paramya, paramFloat);
/*     */     
/*  51 */     if (paramya.cb().o() != awt.a) {
/*  52 */       GL11.glEnable(32826);
/*  53 */       GL11.glPushMatrix();
/*     */       
/*  55 */       float f1 = 0.5F;
/*  56 */       GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
/*  57 */       f1 *= 1.0F;
/*  58 */       GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/*  59 */       GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*  60 */       GL11.glScalef(-f1, -f1, f1);
/*     */       
/*  62 */       int i = paramya.c(paramFloat);
/*  63 */       int j = i % 65536;
/*  64 */       int k = i / 65536;
/*     */       
/*  66 */       buu.a(buu.c, j / 1.0F, k / 1.0F);
/*     */       
/*  68 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  69 */       a(bpz.b);
/*  70 */       this.c.a(paramya.cb(), paramya.cc(), 1.0F);
/*  71 */       GL11.glPopMatrix();
/*  72 */       GL11.glDisable(32826);
/*     */     }
/*     */   }
/*     */   
/*     */   protected int a(ya paramya, int paramInt, float paramFloat)
/*     */   {
/*  78 */     if (paramInt != 0) { return -1;
/*     */     }
/*  80 */     a(a);
/*  81 */     float f1 = 1.0F;
/*  82 */     GL11.glEnable(3042);
/*  83 */     GL11.glDisable(3008);
/*  84 */     GL11.glBlendFunc(1, 1);
/*  85 */     GL11.glDisable(2896);
/*  86 */     if (paramya.ap()) {
/*  87 */       GL11.glDepthMask(false);
/*     */     } else {
/*  89 */       GL11.glDepthMask(true);
/*     */     }
/*     */     
/*  92 */     int i = 61680;
/*  93 */     int j = i % 65536;
/*  94 */     int k = i / 65536;
/*     */     
/*  96 */     buu.a(buu.c, j / 1.0F, k / 1.0F);
/*     */     
/*  98 */     GL11.glEnable(2896);
/*  99 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, f1);
/* 100 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */