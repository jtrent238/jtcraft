/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.Agent;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.GameProfileRepository;
/*     */ import com.mojang.authlib.ProfileLookupCallback;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class nz
/*     */ {
/*  31 */   private static final Logger e = ;
/*  32 */   public static final File a = new File("banned-ips.txt");
/*  33 */   public static final File b = new File("banned-players.txt");
/*  34 */   public static final File c = new File("ops.txt");
/*  35 */   public static final File d = new File("white-list.txt");
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
/*     */   private static void a(MinecraftServer paramMinecraftServer, Collection paramCollection, ProfileLookupCallback paramProfileLookupCallback)
/*     */   {
/*  51 */     String[] arrayOfString1 = (String[])Iterators.toArray(Iterators.filter(paramCollection.iterator(), new oa()), String.class);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */     if (paramMinecraftServer.Y()) {
/*  58 */       paramMinecraftServer.aw().findProfilesByNames(arrayOfString1, Agent.MINECRAFT, paramProfileLookupCallback);
/*     */     } else {
/*  60 */       for (String str : arrayOfString1) {
/*  61 */         UUID localUUID = yz.a(new GameProfile(null, str));
/*  62 */         GameProfile localGameProfile = new GameProfile(localUUID, str);
/*  63 */         paramProfileLookupCallback.onProfileLookupSucceeded(localGameProfile);
/*     */       }
/*     */     }
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
/*     */   public static String a(String paramString)
/*     */   {
/* 240 */     if ((qn.b(paramString)) || (paramString.length() > 16)) {
/* 241 */       return paramString;
/*     */     }
/* 243 */     MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 244 */     GameProfile localGameProfile = localMinecraftServer.ax().a(paramString);
/* 245 */     if ((localGameProfile != null) && (localGameProfile.getId() != null)) {
/* 246 */       return localGameProfile.getId().toString();
/*     */     }
/* 248 */     if ((localMinecraftServer.N()) || (!localMinecraftServer.Y())) {
/* 249 */       return yz.a(new GameProfile(null, paramString)).toString();
/*     */     }
/* 251 */     ArrayList localArrayList = Lists.newArrayList();
/* 252 */     oe localoe = new oe(localMinecraftServer, localArrayList);
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
/* 264 */     a(localMinecraftServer, Lists.newArrayList(new String[] { paramString }), localoe);
/* 265 */     if ((localArrayList.size() > 0) && (((GameProfile)localArrayList.get(0)).getId() != null)) {
/* 266 */       return ((GameProfile)localArrayList.get(0)).getId().toString();
/*     */     }
/*     */     
/* 269 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */