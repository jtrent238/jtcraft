/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.InsecureTextureException;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class brm
/*     */   implements Runnable
/*     */ {
/*     */   brm(brj parambrj, GameProfile paramGameProfile, boolean paramBoolean, bro parambro) {}
/*     */   
/*     */   public void run()
/*     */   {
/*  98 */     HashMap localHashMap = Maps.newHashMap();
/*     */     try
/*     */     {
/* 101 */       localHashMap.putAll(brj.a(this.d).getTextures(this.a, this.b));
/*     */     }
/*     */     catch (InsecureTextureException localInsecureTextureException) {}
/*     */     
/* 105 */     if ((localHashMap.isEmpty()) && (this.a.getId().equals(bao.B().M().e().getId()))) {
/* 106 */       localHashMap.putAll(brj.a(this.d).getTextures(brj.a(this.d).fillProfileProperties(this.a, false), false));
/*     */     }
/*     */     
/* 109 */     bao.B().a(new brn(this, localHashMap));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */