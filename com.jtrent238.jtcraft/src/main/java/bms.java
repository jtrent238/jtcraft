/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ public class bms
/*     */   extends bml
/*     */ {
/*  22 */   private static final bqx c = new bqx("textures/entity/skeleton/skeleton.png");
/*  23 */   private static final bqx d = new bqx("textures/entity/skeleton/wither_skeleton.png");
/*  24 */   private static final bqx e = new bqx("textures/entity/zombie/zombie.png");
/*  25 */   private static final bqx f = new bqx("textures/entity/creeper/creeper.png");
/*     */   
/*     */ 
/*     */   public static bms b;
/*     */   
/*  30 */   private bib g = new bib(0, 0, 64, 32);
/*  31 */   private bib h = new bib(0, 0, 64, 64);
/*     */   
/*     */   public void a(apn paramapn, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*     */   {
/*  35 */     a((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, paramapn.p() & 0x7, paramapn.c() * 360 / 16.0F, paramapn.b(), paramapn.a());
/*     */   }
/*     */   
/*     */   public void a(bmk parambmk)
/*     */   {
/*  40 */     super.a(parambmk);
/*  41 */     b = this;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, float paramFloat4, int paramInt2, GameProfile paramGameProfile) {
/*  45 */     bib localbib = this.g;
/*     */     
/*  47 */     switch (paramInt2) {
/*     */     case 0: 
/*     */     default: 
/*  50 */       a(c);
/*  51 */       break;
/*     */     case 1: 
/*  53 */       a(d);
/*  54 */       break;
/*     */     case 2: 
/*  56 */       a(e);
/*  57 */       localbib = this.h;
/*  58 */       break;
/*     */     case 3: 
/*  60 */       bqx localbqx = blg.b;
/*     */       
/*  62 */       if (paramGameProfile != null) {
/*  63 */         bao localbao = bao.B();
/*  64 */         Map localMap = localbao.ad().a(paramGameProfile);
/*  65 */         if (localMap.containsKey(MinecraftProfileTexture.Type.SKIN)) {
/*  66 */           localbqx = localbao.ad().a((MinecraftProfileTexture)localMap.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
/*     */         }
/*     */       }
/*     */       
/*  70 */       a(localbqx);
/*  71 */       break;
/*     */     case 4: 
/*  73 */       a(f);
/*     */     }
/*     */     
/*     */     
/*  77 */     GL11.glPushMatrix();
/*  78 */     GL11.glDisable(2884);
/*     */     
/*  80 */     if (paramInt1 != 1) {
/*  81 */       switch (paramInt1) {
/*     */       case 2: 
/*  83 */         GL11.glTranslatef(paramFloat1 + 0.5F, paramFloat2 + 0.25F, paramFloat3 + 0.74F);
/*  84 */         break;
/*     */       case 3: 
/*  86 */         GL11.glTranslatef(paramFloat1 + 0.5F, paramFloat2 + 0.25F, paramFloat3 + 0.26F);
/*  87 */         paramFloat4 = 180.0F;
/*  88 */         break;
/*     */       case 4: 
/*  90 */         GL11.glTranslatef(paramFloat1 + 0.74F, paramFloat2 + 0.25F, paramFloat3 + 0.5F);
/*  91 */         paramFloat4 = 270.0F;
/*  92 */         break;
/*     */       case 5: 
/*     */       default: 
/*  95 */         GL11.glTranslatef(paramFloat1 + 0.26F, paramFloat2 + 0.25F, paramFloat3 + 0.5F);
/*  96 */         paramFloat4 = 90.0F;
/*  97 */         break;
/*     */       }
/*     */     } else {
/* 100 */       GL11.glTranslatef(paramFloat1 + 0.5F, paramFloat2, paramFloat3 + 0.5F);
/*     */     }
/*     */     
/* 103 */     float f1 = 0.0625F;
/* 104 */     GL11.glEnable(32826);
/* 105 */     GL11.glScalef(-1.0F, -1.0F, 1.0F);
/*     */     
/* 107 */     GL11.glEnable(3008);
/*     */     
/* 109 */     localbib.a(null, 0.0F, 0.0F, 0.0F, paramFloat4, 0.0F, f1);
/*     */     
/* 111 */     GL11.glPopMatrix();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */