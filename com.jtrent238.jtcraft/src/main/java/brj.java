/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import java.io.File;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import java.util.concurrent.LinkedBlockingQueue;
/*     */ import java.util.concurrent.ThreadPoolExecutor;
/*     */ import java.util.concurrent.TimeUnit;
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
/*     */ public class brj
/*     */ {
/*  29 */   public static final bqx a = new bqx("textures/entity/steve.png");
/*  30 */   private static final ExecutorService b = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
/*     */   private final bqf c;
/*     */   private final File d;
/*     */   private final MinecraftSessionService e;
/*     */   private final LoadingCache f;
/*     */   
/*     */   public brj(bqf parambqf, File paramFile, MinecraftSessionService paramMinecraftSessionService)
/*     */   {
/*  38 */     this.c = parambqf;
/*  39 */     this.d = paramFile;
/*  40 */     this.e = paramMinecraftSessionService;
/*     */     
/*  42 */     this.f = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new brk(this));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bqx a(MinecraftProfileTexture paramMinecraftProfileTexture, MinecraftProfileTexture.Type paramType)
/*     */   {
/*  54 */     return a(paramMinecraftProfileTexture, paramType, null);
/*     */   }
/*     */   
/*     */   public bqx a(MinecraftProfileTexture paramMinecraftProfileTexture, MinecraftProfileTexture.Type paramType, bro parambro) {
/*  58 */     bqx localbqx = new bqx("skins/" + paramMinecraftProfileTexture.getHash());
/*  59 */     bqh localbqh = this.c.b(localbqx);
/*     */     
/*  61 */     if (localbqh != null) {
/*  62 */       if (parambro != null) {
/*  63 */         parambro.a(paramType, localbqx);
/*     */       }
/*     */     } else {
/*  66 */       File localFile1 = new File(this.d, paramMinecraftProfileTexture.getHash().substring(0, 2));
/*  67 */       File localFile2 = new File(localFile1, paramMinecraftProfileTexture.getHash());
/*  68 */       blx localblx = paramType == MinecraftProfileTexture.Type.SKIN ? new bmc() : null;
/*  69 */       bpr localbpr = new bpr(localFile2, paramMinecraftProfileTexture.getUrl(), a, new brl(this, localblx, parambro, paramType, localbqx));
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
/*  88 */       this.c.a(localbqx, localbpr);
/*     */     }
/*     */     
/*  91 */     return localbqx;
/*     */   }
/*     */   
/*     */   public void a(GameProfile paramGameProfile, bro parambro, boolean paramBoolean) {
/*  95 */     b.submit(new brm(this, paramGameProfile, paramBoolean, parambro));
/*     */   }
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
/*     */   public Map a(GameProfile paramGameProfile)
/*     */   {
/* 125 */     return (Map)this.f.getUnchecked(paramGameProfile);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */