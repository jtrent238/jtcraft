/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ public class ns
/*     */ {
/*  26 */   public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
/*  27 */   private final Map c = Maps.newHashMap();
/*  28 */   private final Map d = Maps.newHashMap();
/*  29 */   private final LinkedList e = Lists.newLinkedList();
/*     */   private final MinecraftServer f;
/*     */   protected final Gson b;
/*     */   private final File g;
/*     */   
/*     */   public ns(MinecraftServer paramMinecraftServer, File paramFile) {
/*  35 */     this.f = paramMinecraftServer;
/*  36 */     this.g = paramFile;
/*     */     
/*  38 */     GsonBuilder localGsonBuilder = new GsonBuilder();
/*  39 */     localGsonBuilder.registerTypeHierarchyAdapter(nv.class, new nw(this, null));
/*  40 */     this.b = localGsonBuilder.create();
/*     */     
/*  42 */     b();
/*     */   }
/*     */   
/*     */   private static GameProfile a(MinecraftServer paramMinecraftServer, String paramString) {
/*  46 */     GameProfile[] arrayOfGameProfile = new GameProfile[1];
/*  47 */     nt localnt = new nt(arrayOfGameProfile);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */     paramMinecraftServer.aw().findProfilesByNames(new String[] { paramString }, com.mojang.authlib.Agent.MINECRAFT, localnt);
/*  60 */     if ((!paramMinecraftServer.Y()) && (arrayOfGameProfile[0] == null)) {
/*  61 */       UUID localUUID = yz.a(new GameProfile(null, paramString));
/*  62 */       GameProfile localGameProfile = new GameProfile(localUUID, paramString);
/*  63 */       localnt.onProfileLookupSucceeded(localGameProfile);
/*     */     }
/*  65 */     return arrayOfGameProfile[0];
/*     */   }
/*     */   
/*     */   public void a(GameProfile paramGameProfile) {
/*  69 */     a(paramGameProfile, null);
/*     */   }
/*     */   
/*     */   private void a(GameProfile paramGameProfile, Date paramDate) {
/*  73 */     UUID localUUID = paramGameProfile.getId();
/*  74 */     if (paramDate == null) {
/*  75 */       localObject1 = Calendar.getInstance();
/*  76 */       ((Calendar)localObject1).setTime(new Date());
/*  77 */       ((Calendar)localObject1).add(2, 1);
/*  78 */       paramDate = ((Calendar)localObject1).getTime();
/*     */     }
/*  80 */     Object localObject1 = paramGameProfile.getName().toLowerCase(Locale.ROOT);
/*  81 */     nv localnv1 = new nv(this, paramGameProfile, paramDate, null);
/*  82 */     synchronized (this.e) {
/*  83 */       if (this.d.containsKey(localUUID)) {
/*  84 */         nv localnv2 = (nv)this.d.get(localUUID);
/*  85 */         this.c.remove(localnv2.a().getName().toLowerCase(Locale.ROOT));
/*  86 */         this.c.put(paramGameProfile.getName().toLowerCase(Locale.ROOT), localnv1);
/*  87 */         this.e.remove(paramGameProfile);
/*     */       } else {
/*  89 */         this.d.put(localUUID, localnv1);
/*  90 */         this.c.put(localObject1, localnv1);
/*     */       }
/*  92 */       this.e.addFirst(paramGameProfile);
/*     */     }
/*     */   }
/*     */   
/*     */   public GameProfile a(String paramString) {
/*  97 */     String str = paramString.toLowerCase(Locale.ROOT);
/*  98 */     nv localnv = (nv)this.c.get(str);
/*     */     
/*     */ 
/* 101 */     if ((localnv != null) && (new Date().getTime() >= nv.a(localnv).getTime())) {
/* 102 */       this.d.remove(localnv.a().getId());
/* 103 */       this.c.remove(localnv.a().getName().toLowerCase(Locale.ROOT));
/* 104 */       synchronized (this.e) {
/* 105 */         this.e.remove(localnv.a());
/*     */       }
/* 107 */       localnv = null;
/*     */     }
/*     */     
/* 110 */     if (localnv != null)
/*     */     {
/* 112 */       ??? = localnv.a();
/* 113 */       synchronized (this.e) {
/* 114 */         this.e.remove(???);
/* 115 */         this.e.addFirst(???);
/*     */       }
/*     */     } else {
/* 118 */       ??? = a(this.f, str);
/* 119 */       if (??? != null) {
/* 120 */         a((GameProfile)???);
/* 121 */         localnv = (nv)this.c.get(str);
/*     */       }
/*     */     }
/* 124 */     c();
/* 125 */     return localnv == null ? null : localnv.a();
/*     */   }
/*     */   
/*     */   public String[] a() {
/* 129 */     ArrayList localArrayList = Lists.newArrayList(this.c.keySet());
/* 130 */     return (String[])localArrayList.toArray(new String[localArrayList.size()]);
/*     */   }
/*     */   
/*     */   public GameProfile a(UUID paramUUID) {
/* 134 */     nv localnv = (nv)this.d.get(paramUUID);
/* 135 */     return localnv == null ? null : localnv.a();
/*     */   }
/*     */   
/*     */   private nv b(UUID paramUUID) {
/* 139 */     nv localnv = (nv)this.d.get(paramUUID);
/* 140 */     if (localnv != null)
/*     */     {
/* 142 */       GameProfile localGameProfile = localnv.a();
/* 143 */       synchronized (this.e) {
/* 144 */         this.e.remove(localGameProfile);
/* 145 */         this.e.addFirst(localGameProfile);
/*     */       }
/*     */     }
/* 148 */     return localnv;
/*     */   }
/*     */   
/*     */   public void b() {
/* 152 */     List localList = null;
/* 153 */     java.io.BufferedReader localBufferedReader = null;
/*     */     try {
/* 155 */       localBufferedReader = Files.newReader(this.g, com.google.common.base.Charsets.UTF_8);
/* 156 */       localList = (List)this.b.fromJson(localBufferedReader, h);
/*     */     } catch (FileNotFoundException localFileNotFoundException) {
/*     */       return;
/*     */     } finally {
/* 160 */       IOUtils.closeQuietly(localBufferedReader);
/*     */     }
/* 162 */     if (localList != null) {
/* 163 */       this.c.clear();
/* 164 */       this.d.clear();
/* 165 */       synchronized (this.e) {
/* 166 */         this.e.clear();
/*     */       }
/*     */       
/*     */ 
/* 170 */       localList = Lists.reverse(localList);
/* 171 */       for (??? = localList.iterator(); ((Iterator)???).hasNext();) { nv localnv = (nv)((Iterator)???).next();
/* 172 */         if (localnv != null) {
/* 173 */           a(localnv.a(), localnv.b());
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() {
/* 180 */     String str = this.b.toJson(a(1000));
/* 181 */     BufferedWriter localBufferedWriter = null;
/*     */     try {
/* 183 */       localBufferedWriter = Files.newWriter(this.g, com.google.common.base.Charsets.UTF_8);
/* 184 */       localBufferedWriter.write(str);
/*     */ 
/*     */     }
/*     */     catch (FileNotFoundException localFileNotFoundException) {}catch (IOException localIOException) {}finally
/*     */     {
/*     */ 
/* 190 */       IOUtils.closeQuietly(localBufferedWriter);
/*     */     }
/*     */   }
/*     */   
/*     */   private List a(int paramInt) {
/* 195 */     ArrayList localArrayList1 = Lists.newArrayList();
/*     */     ArrayList localArrayList2;
/* 197 */     synchronized (this.e) {
/* 198 */       localArrayList2 = Lists.newArrayList(com.google.common.collect.Iterators.limit(this.e.iterator(), paramInt));
/*     */     }
/* 200 */     for (??? = localArrayList2.iterator(); ((Iterator)???).hasNext();) { GameProfile localGameProfile = (GameProfile)((Iterator)???).next();
/* 201 */       nv localnv = b(localGameProfile.getId());
/* 202 */       if (localnv != null)
/*     */       {
/*     */ 
/* 205 */         localArrayList1.add(localnv); }
/*     */     }
/* 207 */     return localArrayList1;
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
/* 275 */   private static final java.lang.reflect.ParameterizedType h = new nu();
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */