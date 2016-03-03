/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import tv.twitch.chat.ChatUserInfo;
/*     */ import tv.twitch.chat.ChatUserMode;
/*     */ import tv.twitch.chat.ChatUserSubscription;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bgs
/*     */   extends bdw
/*     */ {
/*  26 */   private static final a a = a.c;
/*  27 */   private static final a f = a.m;
/*  28 */   private static final a g = a.f;
/*     */   
/*     */   private final ChatUserInfo h;
/*     */   
/*     */   private final fj i;
/*  33 */   private final List r = Lists.newArrayList();
/*     */   private final bum s;
/*     */   private int t;
/*     */   
/*     */   public bgs(bum parambum, ChatUserInfo paramChatUserInfo) {
/*  38 */     this.s = parambum;
/*  39 */     this.h = paramChatUserInfo;
/*     */     
/*  41 */     this.i = new fq(paramChatUserInfo.displayName);
/*     */     
/*  43 */     this.r.addAll(a(paramChatUserInfo.modes, paramChatUserInfo.subscriptions, parambum));
/*     */   }
/*     */   
/*     */   public static List a(Set paramSet1, Set paramSet2, bum parambum) {
/*  47 */     String str = parambum == null ? null : parambum.C();
/*  48 */     boolean bool = (parambum != null) && (parambum.B());
/*  49 */     ArrayList localArrayList = Lists.newArrayList();
/*     */     
/*  51 */     for (Iterator localIterator = paramSet1.iterator(); localIterator.hasNext();) { localObject = (ChatUserMode)localIterator.next();
/*  52 */       localfj = a((ChatUserMode)localObject, str, bool);
/*     */       
/*  54 */       if (localfj != null) {
/*  55 */         localfq = new fq("- ");
/*  56 */         localfq.a(localfj);
/*  57 */         localArrayList.add(localfq); } }
/*     */     Object localObject;
/*     */     fj localfj;
/*     */     fq localfq;
/*  61 */     for (localIterator = paramSet2.iterator(); localIterator.hasNext();) { localObject = (ChatUserSubscription)localIterator.next();
/*  62 */       localfj = a((ChatUserSubscription)localObject, str, bool);
/*     */       
/*  64 */       if (localfj != null) {
/*  65 */         localfq = new fq("- ");
/*  66 */         localfq.a(localfj);
/*  67 */         localArrayList.add(localfq);
/*     */       }
/*     */     }
/*     */     
/*  71 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public static fj a(ChatUserSubscription paramChatUserSubscription, String paramString, boolean paramBoolean) {
/*  75 */     fr localfr = null;
/*     */     
/*  77 */     if (paramChatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
/*  78 */       if (paramString == null) {
/*  79 */         localfr = new fr("stream.user.subscription.subscriber", new Object[0]);
/*  80 */       } else if (paramBoolean) {
/*  81 */         localfr = new fr("stream.user.subscription.subscriber.self", new Object[0]);
/*     */       } else {
/*  83 */         localfr = new fr("stream.user.subscription.subscriber.other", new Object[] { paramString });
/*     */       }
/*  85 */       localfr.b().a(a);
/*  86 */     } else if (paramChatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO) {
/*  87 */       localfr = new fr("stream.user.subscription.turbo", new Object[0]);
/*  88 */       localfr.b().a(g);
/*     */     }
/*     */     
/*  91 */     return localfr;
/*     */   }
/*     */   
/*     */   public static fj a(ChatUserMode paramChatUserMode, String paramString, boolean paramBoolean) {
/*  95 */     fr localfr = null;
/*     */     
/*  97 */     if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
/*  98 */       localfr = new fr("stream.user.mode.administrator", new Object[0]);
/*  99 */       localfr.b().a(g);
/* 100 */     } else if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BANNED) {
/* 101 */       if (paramString == null) {
/* 102 */         localfr = new fr("stream.user.mode.banned", new Object[0]);
/* 103 */       } else if (paramBoolean) {
/* 104 */         localfr = new fr("stream.user.mode.banned.self", new Object[0]);
/*     */       } else {
/* 106 */         localfr = new fr("stream.user.mode.banned.other", new Object[] { paramString });
/*     */       }
/* 108 */       localfr.b().a(f);
/* 109 */     } else if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER) {
/* 110 */       if (paramString == null) {
/* 111 */         localfr = new fr("stream.user.mode.broadcaster", new Object[0]);
/* 112 */       } else if (paramBoolean) {
/* 113 */         localfr = new fr("stream.user.mode.broadcaster.self", new Object[0]);
/*     */       } else {
/* 115 */         localfr = new fr("stream.user.mode.broadcaster.other", new Object[0]);
/*     */       }
/* 117 */       localfr.b().a(a);
/* 118 */     } else if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) {
/* 119 */       if (paramString == null) {
/* 120 */         localfr = new fr("stream.user.mode.moderator", new Object[0]);
/* 121 */       } else if (paramBoolean) {
/* 122 */         localfr = new fr("stream.user.mode.moderator.self", new Object[0]);
/*     */       } else {
/* 124 */         localfr = new fr("stream.user.mode.moderator.other", new Object[] { paramString });
/*     */       }
/* 126 */       localfr.b().a(a);
/* 127 */     } else if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_STAFF) {
/* 128 */       localfr = new fr("stream.user.mode.staff", new Object[0]);
/* 129 */       localfr.b().a(g);
/*     */     }
/*     */     
/* 132 */     return localfr;
/*     */   }
/*     */   
/*     */ 
/*     */   public void b()
/*     */   {
/* 138 */     int j = this.l / 3;
/* 139 */     int k = j - 130;
/* 140 */     this.n.add(new bcb(1, j * 0 + k / 2, this.m - 70, 130, 20, brp.a("stream.userinfo.timeout", new Object[0])));
/* 141 */     this.n.add(new bcb(0, j * 1 + k / 2, this.m - 70, 130, 20, brp.a("stream.userinfo.ban", new Object[0])));
/* 142 */     this.n.add(new bcb(2, j * 2 + k / 2, this.m - 70, 130, 20, brp.a("stream.userinfo.mod", new Object[0])));
/*     */     
/* 144 */     this.n.add(new bcb(5, j * 0 + k / 2, this.m - 45, 130, 20, brp.a("gui.cancel", new Object[0])));
/* 145 */     this.n.add(new bcb(3, j * 1 + k / 2, this.m - 45, 130, 20, brp.a("stream.userinfo.unban", new Object[0])));
/* 146 */     this.n.add(new bcb(4, j * 2 + k / 2, this.m - 45, 130, 20, brp.a("stream.userinfo.unmod", new Object[0])));
/*     */     
/* 148 */     int m = 0;
/* 149 */     for (fj localfj : this.r) {
/* 150 */       m = Math.max(m, this.q.a(localfj.d()));
/*     */     }
/* 152 */     this.t = (this.l / 2 - m / 2);
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 157 */     if (!parambcb.l) { return;
/*     */     }
/* 159 */     if (parambcb.k == 0) {
/* 160 */       this.s.b("/ban " + this.h.displayName);
/* 161 */     } else if (parambcb.k == 3) {
/* 162 */       this.s.b("/unban " + this.h.displayName);
/* 163 */     } else if (parambcb.k == 2) {
/* 164 */       this.s.b("/mod " + this.h.displayName);
/* 165 */     } else if (parambcb.k == 4) {
/* 166 */       this.s.b("/unmod " + this.h.displayName);
/* 167 */     } else if (parambcb.k == 1) {
/* 168 */       this.s.b("/timeout " + this.h.displayName);
/*     */     }
/*     */     
/* 171 */     this.k.a(null);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 176 */     c();
/*     */     
/* 178 */     a(this.q, this.i.c(), this.l / 2, 70, 16777215);
/*     */     
/* 180 */     int j = 80;
/* 181 */     for (fj localfj : this.r) {
/* 182 */       b(this.q, localfj.d(), this.t, j, 16777215);
/* 183 */       j += this.q.a;
/*     */     }
/*     */     
/* 186 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */